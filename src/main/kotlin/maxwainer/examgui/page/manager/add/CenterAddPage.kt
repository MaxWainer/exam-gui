package maxwainer.examgui.page.manager.add

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.ComboBox
import javafx.scene.control.TextField
import javafx.stage.FileChooser
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Center
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.extension.asByteArray
import maxwainer.examgui.extension.asNumeric
import maxwainer.examgui.extension.javafx.errorAlert
import maxwainer.examgui.module.entity.CenterService
import maxwainer.examgui.page.AbstractPage
import maxwainer.examgui.page.EmployerDependPage
import java.awt.image.BufferedImage
import java.net.URL
import java.util.*
import javax.imageio.ImageIO

class CenterAddPage(override val employer: Employer) : AbstractPage(), EmployerDependPage {

  private val fileChooser = FileChooser()

  private val centerService by define<CenterService>()

  private lateinit var image: BufferedImage

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
  private fun onSaveButtonClick() {
    if (!this::image.isInitialized) {
      errorAlert("Creating", "Image is not loaded")
      return
    }

    val name = nameField.text
    val status = statusBox.selectionModel.selectedItem
    val city = cityField.text
    val floorCount = floorCountField.text.toIntOrNull()
    val price = priceField.text.toDoubleOrNull()
    val valueFactor = valueFactorField.text.toFloatOrNull()
    val pavilionCount = pavilionCountField.text.toIntOrNull()
    val image = image.asByteArray

    if (name.isEmpty() ||
      status == null ||
      city.isEmpty() ||
      floorCount == null ||
      price == null ||
      valueFactor == null ||
      pavilionCount == null
    ) {
      errorAlert("Creating", "All fields are required")
      return
    }

    val center = Center().apply {
      this.name = name
      this.status = status
      this.city = city
      this.floorCount = floorCount
      this.price = price
      this.valueFactor = valueFactor
      this.image = image
    }

    centerService.create(center)
  }

  @FXML
  private fun onSelectPictureClick() {
    val file = fileChooser.showOpenDialog(null) ?: return

    // check is file is png or jpg
    if (file.name.endsWith(".png") || file.name.endsWith(".jpg")) {

      val preImage = ImageIO.read(file)

      if (preImage == null) {
        errorAlert("Opening image", "Invalid format")
        return
      }

      image = preImage
      imageButton.text = file.name
    } else {
      errorAlert("Creating", "File is not image")
    }
  }

  override fun initialize(location: URL?, resources: ResourceBundle?) {
    floorCountField.asNumeric()
    priceField.asNumeric()
    valueFactorField.asNumeric()
    pavilionCountField.asNumeric()

    statusBox.items.addAll("План", "Строительство", "Реализация")

    // filter only images
    fileChooser.extensionFilters.add(FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg"))
  }

}