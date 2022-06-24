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
import maxwainer.examgui.page.manager.CenterManagerPage
import maxwainer.examgui.page.manager.EmployerManagerPage
import maxwainer.examgui.page.manager.PavilionsManagerPage
import maxwainer.examgui.page.manager.RentersManagerPage
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
      openPage("centers-page", { CenterManagerPage(employer) }) {
        primaryStage.fixTo(1920.0, 1080.0)
      }
    }

    employersManager.setOnAction {
      openPage("employers-page", { EmployerManagerPage(employer) })
    }

    rentersManager.setOnAction {
      openPage("renters-page", { RentersManagerPage(employer) })
    }

    pavilionsManager.setOnAction {
      openPage("pavilions-page", { PavilionsManagerPage(employer) })
    }
  }
}