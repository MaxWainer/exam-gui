package maxwainer.examgui.page.manager.display

import javafx.fxml.FXML
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.extension.javafx.errorAlert
import maxwainer.examgui.page.AbstractPage
import maxwainer.examgui.page.EmployerDependPage

abstract class ObjectCreatePage<T>(override val employer: Employer) : AbstractPage(), EmployerDependPage {

  @FXML
  private fun onCreateClick() {
    if (isAllowedToCreate) {
      saveObject(createObject())
    } else errorAlert("Creating", "All fields must be filled")
  }

  protected abstract val isAllowedToCreate: Boolean
  protected abstract fun createObject(): T
  protected abstract fun saveObject(obj: T)

}