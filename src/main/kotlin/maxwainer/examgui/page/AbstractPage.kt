package maxwainer.examgui.page

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import maxwainer.examgui.ExamApplication
import maxwainer.examgui.common.inject.delegate.define

abstract class AbstractPage {

  private val parentStage by define<Stage>()

  protected fun <T> openPage(page: String, preprocessor: (T) -> Unit = {}) {
    val loader = FXMLLoader(
      ExamApplication::class.java.getResource("maxwainer/examgui/${page}.fxml"))

    val page = loader.load<Parent>()

    preprocessor(page as T)

    parentStage.scene = Scene(page)
  }

}