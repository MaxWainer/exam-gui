package maxwainer.examgui.page.manager.mutator.center

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.ComboBox
import javafx.scene.control.TextField
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Center
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.extension.ImageSelector
import maxwainer.examgui.extension.asByteArray
import maxwainer.examgui.extension.asNumeric
import maxwainer.examgui.module.entity.CenterService
import maxwainer.examgui.page.manager.display.ObjectCreatePage
import java.awt.image.BufferedImage
import java.net.URL
import java.util.*

class CenterAddPage(employer: Employer) : ObjectCreatePage<Center>(employer) {

  private var image: BufferedImage? = null
  private val imageSelector = ImageSelector(image, imageButton)

  private val centerService by define<CenterService>()

  @FXML
  private lateinit var nameField: TextField

  @FXML
  private lateinit var statusBox: ComboBox<String>

  @FXML
  private lateinit var cityField: TextField

  @FXML
  private lateinit var floorCountField: TextField

  @FXML
  private lateinit var priceField: TextField

  @FXML
  private lateinit var valueFactorField: TextField

  @FXML
  private lateinit var pavilionCountField: TextField

  @FXML
  private lateinit var imageButton: Button

  @FXML
  private fun onSelectPictureClick() {
    imageSelector.onSelectPictureClick()
  }

  override val isAllowedToCreate: Boolean
    get() {
      val name = nameField.text
      val status = statusBox.selectionModel.selectedItem
      val city = cityField.text
      val floorCount = floorCountField.text.toIntOrNull()
      val price = priceField.text.toDoubleOrNull()
      val valueFactor = valueFactorField.text.toFloatOrNull()
      val pavilionCount = pavilionCountField.text.toIntOrNull()
      val image = image?.asByteArray

      // check is some field is empty or null
      return !(name.isNullOrEmpty() &&
              status.isNullOrEmpty() &&
              city.isNullOrEmpty() &&
              floorCount == null &&
              price == null &&
              valueFactor == null &&
              pavilionCount == null &&
              image == null)
    }

  override fun createObject() = Center().apply {
    this.name = nameField.text
    this.status = statusBox.selectionModel.selectedItem
    this.city = cityField.text
    this.floorCount = floorCountField.text.toIntOrNull()
    this.price = priceField.text.toDoubleOrNull()
    this.valueFactor = valueFactorField.text.toFloatOrNull()
    this.pavilionCount = pavilionCountField.text.toIntOrNull()
    this.image = this@CenterAddPage.image?.asByteArray
  }

  override fun saveObject(obj: Center) {
    centerService.create(obj)
  }

  override fun initialize(location: URL?, resources: ResourceBundle?) {
    imageSelector.init()

    floorCountField.asNumeric()
    priceField.asNumeric()
    valueFactorField.asNumeric()
    pavilionCountField.asNumeric()

    statusBox.items.addAll("План", "Строительство", "Реализация")
  }

}