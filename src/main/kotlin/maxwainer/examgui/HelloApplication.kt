package maxwainer.examgui

import jakarta.persistence.Persistence
import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import maxwainer.examgui.common.inject.createModule
import maxwainer.examgui.module.CaptchaModule

class HelloApplication : Application() {

  override fun start(stage: Stage) {
    createModule {
      add(CaptchaModule())
    }

    val fxmlLoader = FXMLLoader(
      HelloApplication::class
        .java
        .getResource("login-view.fxml")
    )

    val scene = Scene(fxmlLoader.load(), 600.0, 400.0)

    scene.stylesheets.add(
      HelloApplication::class
        .java
        .getResource("style/auth-style.css")!!
        .toExternalForm()
    )

//    val entityManagerFactory = Persistence.createEntityManagerFactory("production")
//    val entityManager = entityManagerFactory.createEntityManager()

    stage.title = "Hello!"
    stage.scene = scene
    stage.show()
  }

}