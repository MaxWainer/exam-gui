package maxwainer.examgui.page

import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import maxwainer.examgui.BASE_STYLE
import maxwainer.examgui.ExamApplication
import maxwainer.examgui.common.inject.delegate.define
import java.net.URL
import java.util.*

abstract class AbstractPage : Initializable {

  private val parentStage by define<Stage>()

  protected fun <T> openPage(page: String, factory: () -> T, preprocessor: (T) -> Unit = {}) {
    val loader = FXMLLoader(
      ExamApplication::class.java.getResource("/maxwainer/examgui/${page}.fxml")
    )

    val controller = factory()
    loader.setController(controller)

    preprocessor(controller)

    val parent = loader.load<Parent>()

    parentStage.scene = Scene(parent).apply { stylesheets.add(BASE_STYLE) }
  }

  override fun initialize(location: URL?, resources: ResourceBundle?) {}

}