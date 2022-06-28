package maxwainer.examgui.page.manager.display

import javafx.fxml.FXML
import javafx.scene.control.Button
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.extension.javafx.errorAlert
import maxwainer.examgui.page.AbstractPage
import maxwainer.examgui.page.EmployerDependPage
import java.net.URL
import java.util.*

abstract class ObjectEditPage<T>
  (override val employer: Employer, protected val editable: T) :
  AbstractBackingPage(employer) {

  @FXML
  private lateinit var saveButton: Button

  override fun initialize(location: URL?, resources: ResourceBundle?) {
    saveButton.setOnMouseClicked {
      if (isAllowedToPush) {
        pushUpdate()
      } else errorAlert(
        "Updating",
        "You are not allowed to update this object! You are missed to fill all required fields!"
      )
    }

    initFields()
  }

  protected abstract fun pushUpdate()
  protected abstract val isAllowedToPush: Boolean
  protected abstract fun initFields()

}