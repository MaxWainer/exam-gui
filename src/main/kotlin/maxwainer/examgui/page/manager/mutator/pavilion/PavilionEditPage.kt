package maxwainer.examgui.page.manager.mutator.pavilion

import javafx.fxml.FXML
import javafx.scene.control.ComboBox
import javafx.scene.control.ListCell
import javafx.scene.control.TextField
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Center
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.entities.Pavilion
import maxwainer.examgui.extension.asNumeric
import maxwainer.examgui.module.entity.CenterService
import maxwainer.examgui.page.manager.display.ObjectEditPage

class PavilionEditPage(pavilion: Pavilion, employer: Employer) :
  ObjectEditPage<Pavilion>(employer, pavilion) {

  private val centerService by define<CenterService>()

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

  override fun pushUpdate() {
    TODO("Not yet implemented")
  }

  override val isAllowedToPush: Boolean
    get() = centerBox.value != null &&
            pavilionFloor.text.isNotEmpty() &&
            pavilionNumberField.text.isNotEmpty() &&
            statusBox.value != null &&
            squaresField.text.isNotEmpty() &&
            pricePerSquareField.text.isNotEmpty() &&
            valueFactorField.text.isNotEmpty()

  override fun initFields() {

    pavilionFloor.text = editable.floor.toString()
    pavilionFloor.asNumeric(true)

    squaresField.text = editable.squares.toString()
    squaresField.asNumeric()

    pricePerSquareField.text = editable.pricePerSquare.toString()
    pricePerSquareField.asNumeric()

    valueFactorField.text = editable.valueFactor.toString()
    valueFactorField.asNumeric()

    pavilionNumberField.text = editable.pavilionNumber

    statusBox.selectionModel.select(editable.status)
    statusBox.items.addAll(
      "Забронировано",
      "Арендован",
      "Свободен",
      "Удален"
    )

    centerBox.selectionModel.select(editable.center)
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