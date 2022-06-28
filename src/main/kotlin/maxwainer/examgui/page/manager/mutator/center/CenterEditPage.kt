package maxwainer.examgui.page.manager.mutator.center

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.ComboBox
import javafx.scene.control.TextField
import javafx.scene.image.ImageView
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Center
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.module.entity.CenterService
import maxwainer.examgui.extension.ImageSelector
import maxwainer.examgui.page.manager.display.ObjectEditPage
import maxwainer.examgui.page.model.implementation.center.toImageView
import java.awt.image.BufferedImage

class CenterEditPage(center: Center, override val employer: Employer) :
  ObjectEditPage<Center>(employer, center) {

  private val centerService by define<CenterService>()


  private var image: BufferedImage? = null

  @FXML
  private lateinit var selectImageButton: Button

  @FXML
  private lateinit var nameField: TextField

  @FXML
  private lateinit var statusBox: ComboBox<String>

  @FXML
  private lateinit var pavilionCountField: TextField

  @FXML
  private lateinit var cityField: TextField

  @FXML
  private lateinit var priceField: TextField

  @FXML
  private lateinit var floorCountField: TextField

  @FXML
  private lateinit var imageView: ImageView

  private val imageSelector = ImageSelector(image, selectImageButton)

  override fun pushUpdate() {
    centerService.update(editable)
  }

  override val isAllowedToPush: Boolean
    get() = nameField.text.isNotEmpty() &&
            statusBox.value != null &&
            pavilionCountField.text.isNotEmpty() &&
            cityField.text.isNotEmpty() &&
            priceField.text.isNotEmpty() &&
            floorCountField.text.isNotEmpty() &&
            image != null


  override fun initFields() {
    imageSelector.init()
    selectImageButton.setOnMouseClicked { imageSelector.onSelectPictureClick() }

    cityField.text = editable.city
    nameField.text = editable.name
    statusBox.items.addAll("План", "Строительство", "Реализация")
    statusBox.selectionModel.select(editable.status)
    pavilionCountField.text = editable.pavilionCount.toString()
    floorCountField.text = editable.floorCount.toString()
    priceField.text = editable.price.toString()

    imageView.image = editable.image.toImageView.image
  }

}