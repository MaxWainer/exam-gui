package maxwainer.examgui.page.manager

import javafx.scene.control.Label
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.entities.Pavilion
import maxwainer.examgui.module.entity.PavilionService
import maxwainer.examgui.page.manager.display.ObjectViewingPage
import maxwainer.examgui.page.manager.display.SortingOption
import maxwainer.examgui.page.manager.mutator.pavilion.PavilionAddPage
import maxwainer.examgui.page.manager.mutator.pavilion.PavilionEditPage

class PavilionsPage(override val employer: Employer) :
  ObjectViewingPage<Pavilion, PavilionsPage.PavilionSortOption>(employer) {

  private val pavilionService by define<PavilionService>()

  override val creatorPath = "new-pavilion"
  override val editorPath = "edit-pavilion"
  override val objects: List<Pavilion>
    get() = pavilionService.all()

  override fun createAdder() = PavilionAddPage(employer)
  override fun createEditor(obj: Pavilion) = PavilionEditPage(obj, employer)

  // show all Center object fields via Label
  override fun nodesFromObject(obj: Pavilion) = listOf(
    Label("Center: ${obj.center!!.name}\t"),
    Label("Pavilion number: ${obj.pavilionNumber}\t"),
    Label("Floor: ${obj.floor}\t"),
    Label("Status: ${obj.status}\t"),
    Label("Squares: ${obj.squares}\t"),
    Label("Price per square: ${obj.pricePerSquare}\t"),
    Label("Value factor: ${obj.valueFactor}\t"),
  )


  override fun sort(
    option: PavilionSortOption, sortValue: String, sortable: List<Pavilion>,
  ) = when (option) {
    PavilionSortOption.STATUS -> sortable.filter { it.status == sortValue }
    PavilionSortOption.SQUARES -> sortable.filter { it.squares.toString() == sortValue }
    PavilionSortOption.FLOOR -> sortable.filter { it.floor.toString() == sortValue }
    PavilionSortOption.PRICE -> sortable.filter { it.pricePerSquare.toString() == sortValue }
  }

  override fun showAvailable(
    option: PavilionSortOption,
    sortable: List<Pavilion>,
  ) = when (option) {
    PavilionSortOption.STATUS -> sortable.map { it.status!! }.distinct()
    PavilionSortOption.SQUARES -> sortable.map { it.squares.toString() }.distinct()
    PavilionSortOption.FLOOR -> sortable.map { it.floor.toString() }.distinct()
    PavilionSortOption.PRICE -> sortable.map { it.pricePerSquare.toString() }.distinct()
  }

  enum class PavilionSortOption(override val displayName: String) : SortingOption {
    STATUS("Status"),
    SQUARES("Squares"),
    FLOOR("Floor"),
    PRICE("Price per square");
  }

}