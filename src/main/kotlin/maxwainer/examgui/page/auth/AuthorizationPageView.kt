package maxwainer.examgui.page.auth

import javafx.fxml.FXML
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import javafx.scene.image.ImageView
import javafx.scene.image.WritableImage
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.extension.compareTo
import maxwainer.examgui.extension.forEach
import maxwainer.examgui.extension.isNotNullOrBlank
import maxwainer.examgui.extension.javafx.authErrorAlert
import maxwainer.examgui.extension.javafx.get
import maxwainer.examgui.extension.javafx.textProperty
import maxwainer.examgui.module.Captcha
import maxwainer.examgui.module.CaptchaModule
import maxwainer.examgui.module.entity.EmployerService
import maxwainer.examgui.page.AbstractPage
import maxwainer.examgui.page.base.MainPageView
import java.awt.image.BufferedImage
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import kotlin.properties.Delegates

class AuthorizationPageView : AbstractPage() {

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

  private var invalidCount = AtomicInteger(0)
  private var invalidState = AtomicBoolean(false)

  private var currentCaptcha by Delegates.notNull<Captcha>()

  @FXML
  private fun onLoginClick() {
    callChecks {
      // open page
      openPage("main-page", { MainPageView(it) })
    }
  }

  private fun callChecks(success: (Employer) -> Unit) {
    // get entered values
    val username = usernameField.textProperty.get
    val password = passwordField.textProperty.get
    val captcha = captchaField.textProperty.get

    // check is username not present
    if (username.isNullOrBlank()) {
      authErrorAlert("Username is required")
      return // stop execution
    }

    // check is password not present
    if (password.isNullOrBlank()) {
      authErrorAlert("Missing password")
      return // stop execution
    }

    if (invalidState.get()) {
      if (captcha.isNullOrBlank()) {
        authErrorAlert("Captcha is required")
        return // stop execution
      }

      if (captcha != currentCaptcha.requiredValue) {
        authErrorAlert("Invalid captcha")
        return // stop execution
      }

      captchaImage.isVisible = false
      captchaField.isVisible = false
      invalidState.set(false)
    }

    if (username.isNotNullOrBlank() // check is username not blank
      && password.isNotNullOrBlank() // check is captcha not blank
    ) {
      val employer = employerService.byColumn("login", username)

      // check is employer exists
      if (employer == null)
        authErrorAlert("Employer not found")
      else
        if (employer.password == password)
          success(employer)
        else
          if (handleInvalid()) authErrorAlert("Wrong password!")
    }

    clearFields()
  }

  private fun handleInvalid(): Boolean {
    invalidCount.incrementAndGet()
    if (invalidCount >= 3) {
      authErrorAlert("You have entered wrong password too many times!")
      initializedCaptcha()

      invalidState.set(true)
      invalidCount.set(0)
      return false
    }

    return true
  }

  private fun initializedCaptcha() {
    captchaField.isVisible = true
    captchaImage.isVisible = true

    currentCaptcha = captchaModule.createCaptcha()

    val image = currentCaptcha.image

    captchaImage.image = image.asImageView.image
  }

  private fun clearFields() {
    usernameField.text = ""
    passwordField.text = ""
    captchaField.text = ""
  }

}

val BufferedImage.asImageView get(): ImageView {
  val writable = WritableImage(width, height)

  val pixelWriter = writable.pixelWriter

  forEach { x, y ->
    pixelWriter.setArgb(x, y, getRGB(x, y))
  }

  return ImageView(writable)
}
