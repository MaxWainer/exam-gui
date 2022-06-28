package maxwainer.examgui.page.manager.mutator.pavilion

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.ComboBox
import javafx.scene.control.ListCell
import javafx.scene.control.TextField
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Center
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.entities.Pavilion
import maxwainer.examgui.extension.ImageSelector
import maxwainer.examgui.extension.asNumeric
import maxwainer.examgui.module.entity.CenterService
import maxwainer.examgui.module.entity.PavilionService
import maxwainer.examgui.page.manager.display.ObjectCreatePage
import java.awt.image.BufferedImage
import java.net.URL
import java.util.*

class PavilionAddPage(employer: Employer) : ObjectCreatePage<Pavilion>(employer) {

  private val centerService by define<CenterService>()
  private val pavilionService by define<PavilionService>()

  @FXML
  private lateinit var centerBox: ComboBox<Center>

  @FXML
  private lateinit var pavilionFloor: TextField

  @FXML
  private lateinit var pavilionNumberField: TextField

  @FXML
  private lateinit var statusBox: ComboBox<String>

  @FXML
  private lateinit var squaresField: TextField

  @FXML
  private lateinit var pricePerSquareField: TextField

  @FXML
  private lateinit var valueFactorField: TextField

  override val isAllowedToCreate: Boolean
    get() = !centerBox.selectionModel.isEmpty
      && pavilionFloor.text.isNotEmpty()
      && pavilionNumberField.text.isEmpty()
      && !statusBox.selectionModel.isEmpty
      && squaresField.text.isNotEmpty()
      && pricePerSquareField.text.isNotEmpty()
      && valueFactorField.text.isNotEmpty()

  override fun createObject() = Pavilion().apply {
    center = centerBox.selectionModel.selectedItem
    floor = pavilionFloor.text.toInt()
    pavilionNumber = pavilionNumberField.text
    status = statusBox.selectionModel.selectedItem
    squares = squaresField.text.toInt()
    pricePerSquare = pricePerSquareField.text.toDouble()
    valueFactor = valueFactorField.text.toFloat()
  }

  override fun saveObject(obj: Pavilion) {
    pavilionService.create(obj)
  }

  override fun initialize(location: URL?, resources: ResourceBundle?) {
    super.initialize(location, resources)

    pavilionFloor.asNumeric(true)
    squaresField.asNumeric()
    pricePerSquareField.asNumeric()
    valueFactorField.asNumeric()

    statusBox.items.addAll(
      "Забронировано",
      "Арендован",
      "Свободен",
      "Удален"
    )

    centerBox.items.addAll(centerService.all())
    centerBox.setCellFactory {
      object : ListCell<Center>() {
        override fun updateItem(item: Center?, empty: Boolean) {
          super.updateItem(item, empty)
          if (!empty && item != null) {
            text = item.name
          }
        }
      }
    }
  }
}