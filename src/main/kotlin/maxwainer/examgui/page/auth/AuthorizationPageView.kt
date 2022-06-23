package maxwainer.examgui.page.auth

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Label
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.image.WritableImage
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.extension.forEach
import maxwainer.examgui.extension.isNotNullOrBlank
import maxwainer.examgui.extension.javafx.get
import maxwainer.examgui.extension.javafx.textProperty
import maxwainer.examgui.module.Captcha
import maxwainer.examgui.module.CaptchaModule
import maxwainer.examgui.module.entity.EmployerService
import maxwainer.examgui.page.AbstractPage
import maxwainer.examgui.page.base.MainPageView
import java.awt.image.BufferedImage
import java.net.URL
import java.util.*
import kotlin.properties.Delegates

class AuthorizationPageView : AbstractPage(), Initializable {

  // get captcha module
  private val captchaModule by define<CaptchaModule>()

  private val employerService by define<EmployerService>()

  @FXML
  private lateinit var usernameField: TextField

  @FXML
  private lateinit var passwordField: PasswordField

  @FXML
  private lateinit var captchaField: TextField

  @FXML
  private lateinit var captchaImage: ImageView

  @FXML
  private lateinit var errorLabel: Label

  private var currentCaptcha by Delegates.notNull<Captcha>()

  @FXML
  private fun onLoginClick() {
    errorLabel.text = "" // clear text

    callChecks {
      // open page and set employer via preprocessor
      openPage<MainPageView>("main-page") { page ->
        page.employer = it
      }
    }
  }

  private fun callChecks(success: (Employer) -> Unit) {
    // get entered values
    val username = usernameField.textProperty.get
    val password = passwordField.textProperty.get
    val captcha = captchaField.textProperty.get

    // check is username not present
    if (username.isNullOrBlank()) {
      errorLabel.text += "Missing username\n"
    }

    // check is password not present
    if (password.isNullOrBlank()) {
      errorLabel.text += "Missing password\n"
    }

    if (captcha.isNullOrBlank()) {
      errorLabel.text += "Missing captcha!"
    }

    if (username.isNotNullOrBlank() // check is username not blank
      && password.isNotNullOrBlank() // check is password not blank
      && captcha.isNotNullOrBlank() // check is captcha not blank
    ) {
      if (captcha == currentCaptcha.requiredValue) {
        val employer = employerService.byColumn("username", username!!)

        // check is employer exists
        if (employer == null) {
          errorLabel.text += "Unknown user!"
        } else {
          // check is password equals
          if (employer.password == password) {
            success(employer)
          } else errorLabel.text += "Invalid password!" // else we show error
        }
      } else {
        // set label
        errorLabel.text += "You entered wrong captcha!"
      }
    }

    // always regenerate captcha
    initialize(null, null)
  }

  override fun initialize(location: URL?, resources: ResourceBundle?) {

    currentCaptcha = captchaModule.createCaptcha()

    val image = currentCaptcha.image

    captchaImage.image = image.toImageView()
  }

}

private fun BufferedImage.toImageView(): Image {
  val writable = WritableImage(width, height)

  val pixelWriter = writable.pixelWriter

  forEach { x, y ->
    pixelWriter.setArgb(x, y, getRGB(x, y))
  }

  return ImageView(writable).image
}
