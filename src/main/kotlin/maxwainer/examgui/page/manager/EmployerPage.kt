package maxwainer.examgui.page.manager

import javafx.scene.control.Label
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.module.entity.EmployerService
import maxwainer.examgui.page.manager.display.ObjectViewingPage
import maxwainer.examgui.page.manager.display.SortingOption
import maxwainer.examgui.page.manager.mutator.employer.EmployerAddPage
import maxwainer.examgui.page.manager.mutator.employer.EmployerEditPage
import maxwainer.examgui.page.model.implementation.center.toImageView

class EmployerPage(override val employer: Employer) :
  ObjectViewingPage<Employer, EmployerPage.EmployerSortOption>(employer) {

  private val employerService by define<EmployerService>()
  override val sortTypes = EmployerSortOption.values()

  override val creatorPath = "new-employer"
  override val editorPath = "edit-employer"
  override val objects: List<Employer>
    get() = employerService.all()

  override fun createAdder() = EmployerAddPage(employer)
  override fun createEditor(obj: Employer) = EmployerEditPage(obj, employer)

  // show all Center object fields via Label
  override fun nodesFromObject(obj: Employer) = listOf(
    Label("Name: ${obj.name}\t"),
    Label("Second name: ${obj.secondName}\t"),
    Label("Patronymic: ${obj.patronymic}\t"),
    Label("Role: ${obj.role}\t"),
    Label("Phone number: ${obj.phoneNumber}\t"),
    Label("Sex: ${obj.sex}\t"),
    Label("Login: ${obj.login}\t"),
    obj.photo.toImageView
  )


  override fun sort(
    option: EmployerSortOption, sortValue: String, sortable: List<Employer>,
  ) = when (option) {
    EmployerSortOption.NAME -> sortable.filter { it.name == sortValue }
    EmployerSortOption.SECOND_NAME -> sortable.filter { it.secondName == sortValue }
    EmployerSortOption.PATRONYMIC -> sortable.filter { it.patronymic == sortValue }
    EmployerSortOption.ROLE -> sortable.filter { it.role == sortValue }
    EmployerSortOption.SEX -> sortable.filter { it.sex == sortValue }
  }

  override fun showAvailable(
    option: EmployerSortOption,
    sortable: List<Employer>,
  ) = when (option) {
    EmployerSortOption.NAME -> sortable.map { it.name!! }.distinct()
    EmployerSortOption.SECOND_NAME -> sortable.map { it.secondName!! }.distinct()
    EmployerSortOption.PATRONYMIC -> sortable.map { it.patronymic!! }.distinct()
    EmployerSortOption.ROLE -> sortable.map { it.role!! }.distinct()
    EmployerSortOption.SEX -> sortable.map { it.sex!! }.distinct()
  }

  enum class EmployerSortOption(override val displayName: String) : SortingOption {
    NAME("Name"),
    SECOND_NAME("Second name"),
    PATRONYMIC("Patronymic"),
    ROLE("Role"),
    SEX("Sex")
  }

}