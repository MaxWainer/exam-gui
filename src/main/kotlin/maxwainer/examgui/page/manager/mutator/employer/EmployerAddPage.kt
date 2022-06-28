package maxwainer.examgui.page.manager.mutator.employer

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.ComboBox
import javafx.scene.control.TextField
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.extension.ImageSelector
import maxwainer.examgui.extension.asByteArray
import maxwainer.examgui.module.entity.EmployerService
import maxwainer.examgui.page.manager.display.ObjectCreatePage
import java.awt.image.BufferedImage
import java.net.URL
import java.util.*

class EmployerAddPage(employer: Employer) : ObjectCreatePage<Employer>(employer) {

  private var image: BufferedImage? = null
  private val imageSelector = ImageSelector(image, imageButton)

  private val employerService by define<EmployerService>()

  @FXML
  private lateinit var nameField: TextField

  @FXML
  private lateinit var secondNameField: TextField

  @FXML
  private lateinit var patronymicField: TextField

  @FXML
  private lateinit var passwordField: TextField

  @FXML
  private lateinit var roleField: TextField

  @FXML
  private lateinit var phoneNumberField: TextField

  @FXML
  private lateinit var loginField: TextField

  @FXML
  private lateinit var genderSelector: ComboBox<Char>

  @FXML
  private lateinit var imageButton: Button

  @FXML
  private fun onSelectPictureClick() {
    imageSelector.onSelectPictureClick()
  }

  override val isAllowedToCreate: Boolean
    get() = nameField.text.isNotEmpty() &&
        secondNameField.text.isNotEmpty() &&
        patronymicField.text.isNotEmpty() &&
        passwordField.text.isNotEmpty() &&
        roleField.text.isNotEmpty() &&
        phoneNumberField.text.isNotEmpty() &&
        loginField.text.isNotEmpty() &&
        genderSelector.value != null &&
        imageSelector.image != null

  override fun createObject() = Employer().apply {
    name = nameField.text
    secondName = secondNameField.text
    patronymic = patronymicField.text
    password = passwordField.text
    role = roleField.text
    phoneNumber = phoneNumberField.text
    login = loginField.text
    sex = genderSelector.selectionModel.selectedItem.toString()
    photo = imageSelector.image?.asByteArray
  }

  override fun saveObject(obj: Employer) {
    employerService.create(obj)
  }

  override fun initialize(location: URL?, resources: ResourceBundle?) {
    imageSelector.init()

    genderSelector.items.addAll('М', 'Ж')
  }

}