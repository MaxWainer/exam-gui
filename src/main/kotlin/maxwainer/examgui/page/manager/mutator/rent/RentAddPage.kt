package maxwainer.examgui.page.manager.mutator.rent

import javafx.fxml.FXML
import javafx.scene.control.ComboBox
import javafx.scene.control.DatePicker
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.entities.Pavilion
import maxwainer.examgui.entities.Rent
import maxwainer.examgui.entities.Renter
import maxwainer.examgui.module.entity.*
import maxwainer.examgui.page.manager.display.ObjectCreatePage
import java.net.URL
import java.util.*

class RentAddPage(employer: Employer) : ObjectCreatePage<Rent>(employer) {

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

  override val isAllowedToCreate: Boolean
    get() = renterBox.selectionModel.selectedItem != null &&
        pavilionBox.selectionModel.selectedItem != null &&
        employerBox.selectionModel.selectedItem != null &&
        rentStartDatePicker.value != null &&
        rentEndDatePicker.value != null &&
        statusBox.selectionModel.selectedItem != null

  override fun createObject() = Rent().apply {
    renter = renterBox.selectionModel.selectedItem
    pavilion = pavilionBox.selectionModel.selectedItem
    employer = employerBox.selectionModel.selectedItem
    rentStart = rentStartDatePicker.value
    rentEnd = rentEndDatePicker.value
    status = statusBox.selectionModel.selectedItem
  }

  override fun saveObject(obj: Rent) {
    rentService.create(obj)
  }

  override fun initialize(location: URL?, resources: ResourceBundle?) {
    super.initialize(location, resources)

    renterBox.items.addAll(renterService.all())
    pavilionBox.items.addAll(pavilionService.all())
    employerBox.items.addAll(employerService.all())
    statusBox.items.addAll("Открыт", "Ожидание", "Закрыт")
  }

}