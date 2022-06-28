package maxwainer.examgui.page.manager.mutator.renter

import javafx.fxml.FXML
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.entities.Renter
import maxwainer.examgui.module.entity.RenterService
import maxwainer.examgui.page.manager.display.ObjectCreatePage
import java.awt.TextField

class RenterAddPage(employer: Employer) : ObjectCreatePage<Renter>(employer) {

  private val renterService by define<RenterService>()

  @FXML
  private lateinit var nameField: TextField

  @FXML
  private lateinit var phoneField: TextField

  @FXML
  private lateinit var addressField: TextField

  override val isAllowedToCreate: Boolean
    get() = nameField.text.isNotEmpty() &&
        phoneField.text.isNotEmpty() &&
        addressField.text.isNotEmpty()

  override fun createObject() = Renter().apply {
    name = nameField.text
    phone = phoneField.text
    address = addressField.text
  }

  override fun saveObject(obj: Renter) {
    renterService.create(obj)
  }
}