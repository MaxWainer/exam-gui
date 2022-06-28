package maxwainer.examgui.page.manager.display

import javafx.fxml.FXML
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.extension.javafx.fixTo
import maxwainer.examgui.page.AbstractPage
import maxwainer.examgui.page.EmployerDependPage
import maxwainer.examgui.page.base.MainPageView

abstract class AbstractBackingPage(override val employer: Employer) : AbstractPage(),
  EmployerDependPage {

  @FXML
  protected open fun onBackButtonClick() {
    openPage("main-page", { MainPageView(employer) }) {
      parentStage.fixTo(600.0, 400.0)
    }
  }

}