package maxwainer.examgui.page.base

import javafx.application.Platform
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.stage.Stage
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.extension.javafx.fixTo
import maxwainer.examgui.extension.javafx.infoAlert
import maxwainer.examgui.page.AbstractPage
import maxwainer.examgui.page.EmployerDependPage
import maxwainer.examgui.page.manager.CenterPage
import maxwainer.examgui.page.manager.EmployerPage
import maxwainer.examgui.page.manager.PavilionsPage
import maxwainer.examgui.page.manager.RentersPage
import java.net.URL
import java.util.*
import kotlin.system.exitProcess

class MainPageView(override val employer: Employer) : AbstractPage(), EmployerDependPage {

  private val primaryStage by define<Stage>()

  @FXML
  private lateinit var aboutAuthor: Button

  @FXML
  private lateinit var aboutProgram: Button

  @FXML
  private lateinit var centersManager: Button

  @FXML
  private lateinit var logoutButton: Button

  @FXML
  private lateinit var employersManager: Button

  @FXML
  private lateinit var rentersManager: Button

  @FXML
  private lateinit var pavilionsManager: Button
  override fun initialize(location: URL?, resources: ResourceBundle?) {
    aboutAuthor.setOnAction {
      infoAlert(
        "Information about author",
        "Created by Ilya Koreysha PKS-305"
      )
    }

    aboutProgram.setOnAction {
      infoAlert(
        "Information about program",
        "Developed by using JavaFX & Kotlin (Hibernate as ORM)"
      )
    }

    logoutButton.setOnAction {
      Platform.exit()
      exitProcess(0)
    }

    centersManager.setOnAction {
      openPage("centers-page", { CenterPage(employer) }) {
        primaryStage.fixTo(1400.0, 700.0)
      }
    }

    employersManager.setOnAction {
      openPage("employers-page", { EmployerPage(employer) })
    }

    rentersManager.setOnAction {
      openPage("renters-page", { RentersPage(employer) })
    }

    pavilionsManager.setOnAction {
      openPage("pavilions-page", { PavilionsPage(employer) })
    }
  }
}