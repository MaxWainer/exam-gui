package maxwainer.examgui.page.manager

import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.entities.Pavilion
import maxwainer.examgui.module.entity.PavilionService
import maxwainer.examgui.page.manager.display.ObjectViewingPage
import maxwainer.examgui.page.manager.display.SortingOption

class PavilionsPage(override val employer: Employer) :
  ObjectViewingPage<Pavilion, PavilionsPage.PavilionSortOption>(employer) {

  private val employerService by define<PavilionService>()

  override val creatorPath = "new-pavilion"
  override val editorPath = "edit-pavilion"
  override val objects: List<Pavilion>
    get() = employerService.all()

  override fun createAdder() = TODO()
  override fun createEditor(obt: Pavilion) = TODO()

  // show all Center object fields via Label
  override fun nodesFromObject(obj: Pavilion) = TODO()


  override fun sort(
    option: PavilionSortOption, sortValue: String, sortable: List<Pavilion>,
  ) = TODO()

  override fun showAvailable(
    option: PavilionSortOption,
    sortable: List<Pavilion>,
  ) = TODO()

  enum class PavilionSortOption(override val displayName: String) : SortingOption

}