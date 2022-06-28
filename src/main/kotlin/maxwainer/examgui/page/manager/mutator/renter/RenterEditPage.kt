package maxwainer.examgui.page.manager.mutator.renter

import javafx.fxml.FXML
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.entities.Renter
import maxwainer.examgui.module.entity.RenterService
import maxwainer.examgui.page.manager.display.ObjectEditPage
import java.awt.TextField

class RenterEditPage(renter: Renter, employer: Employer) :
  ObjectEditPage<Renter>(employer, renter) {

  private val renterService by define<RenterService>()

  @FXML
  private lateinit var nameField: TextField

  @FXML
  private lateinit var phoneField: TextField

  @FXML
  private lateinit var addressField: TextField

  override fun pushUpdate() {
    editable.address = addressField.text
    editable.name = nameField.text
    editable.phone = phoneField.text

    renterService.update(editable)
  }

  override val isAllowedToPush: Boolean
    get() = nameField.text.isNotEmpty() && phoneField.text.isNotEmpty() && addressField.text.isNotEmpty()

  override fun initFields() {
    nameField.text = editable.name
    phoneField.text = editable.phone
    addressField.text = editable.address
  }

}