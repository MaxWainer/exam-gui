package maxwainer.examgui.page.manager

import javafx.scene.control.Label
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.entities.Renter
import maxwainer.examgui.module.entity.RenterService
import maxwainer.examgui.page.manager.display.ObjectViewingPage
import maxwainer.examgui.page.manager.display.SortingOption
import maxwainer.examgui.page.manager.mutator.renter.RenterAddPage
import maxwainer.examgui.page.manager.mutator.renter.RenterEditPage

class RentersPage(override val employer: Employer) :
  ObjectViewingPage<Renter, RentersPage.RenterSortOption>(employer) {

  private val employerService by define<RenterService>()

  override val creatorPath = "new-renter"
  override val editorPath = "edit-renter"
  override val objects: List<Renter>
    get() = employerService.all()

  override fun createAdder() = RenterAddPage(employer)
  override fun createEditor(obj: Renter) = RenterEditPage(obj, employer)

  // show all Center object fields via Label
  override fun nodesFromObject(obj: Renter) = listOf(
    Label("Name: ${obj.name}"),
    Label("Phone: ${obj.phone}"),
    Label("Address: ${obj.address}"),
  )

  override fun sort(
    option: RenterSortOption, sortValue: String, sortable: List<Renter>,
  ) = sortable.filter { it.name.toString() == sortValue }

  override fun showAvailable(
    option: RenterSortOption,
    sortable: List<Renter>,
  ) = sortable.map { it.name!! }.distinct()

  enum class RenterSortOption(override val displayName: String) : SortingOption {
    NAME("Name")
  }

}