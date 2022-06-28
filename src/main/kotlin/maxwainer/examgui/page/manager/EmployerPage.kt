package maxwainer.examgui.page.manager

import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.module.entity.EmployerService
import maxwainer.examgui.page.manager.display.ObjectViewingPage
import maxwainer.examgui.page.manager.display.SortingOption

class EmployerPage(override val employer: Employer) :
  ObjectViewingPage<Employer, EmployerPage.EmployerSortOption>(employer) {

  private val employerService by define<EmployerService>()

  override val creatorPath = "new-employer"
  override val editorPath = "edit-employer"
  override val objects: List<Employer>
    get() = employerService.all()

  override fun createAdder() = TODO()
  override fun createEditor(obt: Employer) = TODO()

  // show all Center object fields via Label
  override fun nodesFromObject(obj: Employer) = TODO()


  override fun sort(
    option: EmployerSortOption, sortValue: String, sortable: List<Employer>,
  ) = TODO()

  override fun showAvailable(
    option: EmployerSortOption,
    sortable: List<Employer>,
  ) = TODO()

  enum class EmployerSortOption(override val displayName: String) : SortingOption

}