package maxwainer.examgui

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import maxwainer.examgui.common.inject.createModule
import maxwainer.examgui.extension.javafx.fixTo
import maxwainer.examgui.module.CaptchaModule
import maxwainer.examgui.module.entity.*
import maxwainer.examgui.module.session.DbSessionProvider

class ExamApplication : Application() {

  override fun start(stage: Stage) {
    createModule {
      add(CaptchaModule())
      add(EmployerService)
      add(DbSessionProvider(ExamApplication::class.java.getResource("/hibernate.cfg.xml")))
    }

    val fxmlLoader = FXMLLoader(
      ExamApplication::class
        .java
        .getResource("login-page.fxml")
    )

    val scene = Scene(fxmlLoader.load())

    stage.fixTo(600.0, 400.0)

    scene.stylesheets.add(
      ExamApplication::class
        .java
        .getResource("style/auth-style.css")!!
        .toExternalForm()
    )

    stage.title = "Hello!"
    stage.scene = scene

    createModule {
      add(CenterService)
      add(PavilionService)
      add(RentService)
      add(RenterService)
      add(stage)
    }

    stage.show()
  }

}