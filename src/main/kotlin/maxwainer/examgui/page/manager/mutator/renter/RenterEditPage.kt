package maxwainer.examgui.page.manager.mutator.renter

import maxwainer.examgui.entities.Employer
import maxwainer.examgui.entities.Renter
import maxwainer.examgui.page.manager.display.ObjectEditPage

class RenterEditPage(renter: Renter, employer: Employer) : ObjectEditPage<Renter>(employer, renter) {



  override fun pushUpdate() {
    TODO("Not yet implemented")
  }

  override val isAllowedToPush: Boolean
    get() = TODO("Not yet implemented")

  override fun initFields() {
    TODO("Not yet implemented")
  }

}