package maxwainer.examgui.page.manager

import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.entities.Renter
import maxwainer.examgui.module.entity.RenterService
import maxwainer.examgui.page.manager.display.ObjectViewingManagerPage
import maxwainer.examgui.page.manager.display.SortingOption

class RentersManagerPage(override val employer: Employer) :
  ObjectViewingManagerPage<Renter, RentersManagerPage.RenterSortOption>(employer) {

  private val employerService by define<RenterService>()

  override val creatorPath = "new-renter"
  override val editorPath = "edit-renter"
  override val objects: List<Renter>
    get() = employerService.all()

  override fun createAdder() = TODO()
  override fun createEditor(obt: Renter) = TODO()

  // show all Center object fields via Label
  override fun nodesFromObject(obj: Renter) = TODO()

  override fun sort(
    option: RenterSortOption, sortValue: String, sortable: List<Renter>,
  ) = TODO()

  override fun showAvailable(
    option: RenterSortOption,
    sortable: List<Renter>,
  ) = TODO()

  enum class RenterSortOption(override val displayName: String) : SortingOption

}