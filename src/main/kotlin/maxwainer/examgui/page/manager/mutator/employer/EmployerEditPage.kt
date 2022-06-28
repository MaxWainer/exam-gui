package maxwainer.examgui.page.manager.mutator.employer

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.ComboBox
import javafx.scene.control.TextField
import javafx.scene.image.ImageView
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.extension.ImageSelector
import maxwainer.examgui.extension.asByteArray
import maxwainer.examgui.module.entity.EmployerService
import maxwainer.examgui.page.manager.display.ObjectEditPage
import maxwainer.examgui.page.model.implementation.center.toImageView
import java.awt.image.BufferedImage

class EmployerEditPage(obj: Employer, employer: Employer) :
  ObjectEditPage<Employer>(obj, employer) {

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
  private lateinit var employerImageView: ImageView

  @FXML
  private fun onSelectPictureClick() {
    imageSelector.onSelectPictureClick()
  }

  override fun pushUpdate() {
    editable.name = nameField.text
    editable.secondName = secondNameField.text
    editable.patronymic = patronymicField.text
    editable.password = passwordField.text
    editable.role = roleField.text
    editable.phoneNumber = phoneNumberField.text
    editable.sex = genderSelector.selectionModel.selectedItem.toString()
    editable.photo = imageSelector.image?.asByteArray

    employerService.update(editable)
  }

  override val isAllowedToPush: Boolean
    get() = nameField.text.isNotEmpty() &&
        secondNameField.text.isNotEmpty() &&
        patronymicField.text.isNotEmpty() &&
        passwordField.text.isNotEmpty() &&
        roleField.text.isNotEmpty() &&
        phoneNumberField.text.isNotEmpty() &&
        loginField.text.isNotEmpty() &&
        genderSelector.value != null &&
        imageSelector.image != null

  override fun initFields() {
    nameField.text = editable.name
    secondNameField.text = editable.secondName
    patronymicField.text = editable.patronymic
    passwordField.text = editable.password
    roleField.text = editable.role
    phoneNumberField.text = editable.phoneNumber
    loginField.text = editable.login

    employerImageView.image = editable
      .photo
      .toImageView
      .image
  }

}