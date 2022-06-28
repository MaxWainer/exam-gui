package maxwainer.examgui.page.manager

import javafx.scene.control.Label
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.entities.Rent
import maxwainer.examgui.module.entity.RentService
import maxwainer.examgui.page.manager.display.ObjectViewingPage
import maxwainer.examgui.page.manager.display.SortingOption
import maxwainer.examgui.page.manager.mutator.rent.RentAddPage
import maxwainer.examgui.page.manager.mutator.rent.RentEditPage

class RentListPage(override val employer: Employer) :
  ObjectViewingPage<Rent, RentListPage.RentSortOption>(employer) {

  private val rentService by define<RentService>()

  override val creatorPath = "new-rent"
  override val editorPath = "edit-rent"
  override val objects: List<Rent>
    get() = rentService.all()
  override val sortTypes: Array<RentSortOption>
    get() = RentSortOption.values()

  override fun createAdder() = RentAddPage(employer)
  override fun createEditor(obj: Rent) = RentEditPage(obj, employer)

  // show all Center object fields via Label
  override fun nodesFromObject(obj: Rent) = listOf(
    Label("Name: ${obj.name}\t"),
    Label("Renter: ${obj.renter!!.name}\t"),
    Label("Pavilion: ${obj.pavilion!!.pavilionNumber}\t"),
    Label("Status: ${obj.status}\t"),
    Label("Rent start: ${obj.rentStart}\t"),
    Label("Rent end: ${obj.rentEnd}\t")
  )

  override fun sort(
    option: RentSortOption, sortValue: String, sortable: List<Rent>,
  ) = when (option) {
    RentSortOption.START_DATE -> sortable.filter { it.rentStart!!.toString() == sortValue }
    RentSortOption.END_DATE -> sortable.filter { it.rentEnd!!.toString() == sortValue }
  }

  override fun showAvailable(
    option: RentSortOption,
    sortable: List<Rent>,
  ) = when (option) {
    RentSortOption.START_DATE -> sortable.map { it.rentStart!!.toString() }.distinct()
    RentSortOption.END_DATE -> sortable.map { it.rentEnd!!.toString() }.distinct()
  }

  enum class RentSortOption(override val displayName: String) : SortingOption {
    START_DATE("Start Date"),
    END_DATE("End Date")
  }

}