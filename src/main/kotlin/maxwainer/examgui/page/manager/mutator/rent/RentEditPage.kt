package maxwainer.examgui.page.manager.mutator.rent

import javafx.fxml.FXML
import javafx.scene.control.ComboBox
import javafx.scene.control.DatePicker
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.entities.Pavilion
import maxwainer.examgui.entities.Rent
import maxwainer.examgui.entities.Renter
import maxwainer.examgui.module.entity.EmployerService
import maxwainer.examgui.module.entity.PavilionService
import maxwainer.examgui.module.entity.RentService
import maxwainer.examgui.module.entity.RenterService
import maxwainer.examgui.page.manager.display.ObjectEditPage

class RentEditPage(rent: Rent, employer: Employer) : ObjectEditPage<Rent>(employer, rent) {

  private val employerService by define<EmployerService>()
  private val renterService by define<RenterService>()
  private val pavilionService by define<PavilionService>()
  private val rentService by define<RentService>()

  @FXML
  private lateinit var renterBox: ComboBox<Renter>

  @FXML
  private lateinit var pavilionBox: ComboBox<Pavilion>

  @FXML
  private lateinit var employerBox: ComboBox<Employer>

  @FXML
  private lateinit var rentStartDatePicker: DatePicker

  @FXML
  private lateinit var rentEndDatePicker: DatePicker

  @FXML
  private lateinit var statusBox: ComboBox<String>

  override fun pushUpdate() {
    editable.status = statusBox.value
    editable.pavilion = pavilionBox.value
    editable.renter = renterBox.value
    editable.employer = employerBox.value
    editable.rentStart = rentStartDatePicker.value
    editable.rentEnd = rentEndDatePicker.value

    rentService.update(editable)
  }

  override val isAllowedToPush: Boolean
    get() = renterBox.selectionModel.selectedItem != null &&
            pavilionBox.selectionModel.selectedItem != null &&
            employerBox.selectionModel.selectedItem != null &&
            rentStartDatePicker.value != null &&
            rentEndDatePicker.value != null &&
            statusBox.selectionModel.selectedItem != null

  override fun initFields() {
    statusBox.items.addAll("Открыт", "Ожидание", "Закрыт")

    renterBox.items.addAll(renterService.all())
    pavilionBox.items.addAll(pavilionService.all())
    employerBox.items.addAll(employerService.all())

    rentStartDatePicker.value = editable.rentStart
    rentEndDatePicker.value = editable.rentEnd
    renterBox.selectionModel.select(editable.renter)
    pavilionBox.selectionModel.select(editable.pavilion)
    employerBox.selectionModel.select(editable.employer)
    statusBox.selectionModel.select(editable.status)
  }

}