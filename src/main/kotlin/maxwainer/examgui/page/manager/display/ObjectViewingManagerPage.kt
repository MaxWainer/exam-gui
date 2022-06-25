package maxwainer.examgui.page.manager.display

import javafx.collections.FXCollections
import javafx.fxml.FXML
import javafx.scene.Node
import javafx.scene.control.ListCell
import javafx.scene.control.ListView
import javafx.scene.control.TableView
import javafx.scene.layout.HBox
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.page.AbstractPage
import maxwainer.examgui.page.EmployerDependPage
import java.net.URL
import java.util.*
import java.util.concurrent.CompletableFuture

abstract class ObjectViewingManagerPage<T>(override val employer: Employer) :
  AbstractPage(),
  EmployerDependPage {

  @FXML
  protected lateinit var objectsView: ListView<T>

  @FXML
  private fun onCreateClick() {
    openPage(creatorPath, { createAdder() })
  }

  override fun initialize(location: URL?, resources: ResourceBundle?) {
    CompletableFuture
      .supplyAsync { objects }
      .thenAccept {
        objectsView.items = FXCollections.observableList(it)
      }.join()

    objectsView.setCellFactory {
      object : ListCell<T>() {

        override fun updateItem(item: T, empty: Boolean) {
          val cell = HBox()
          cell.setOnMouseClicked {
            if (it.clickCount == 2) {
              openPage(editorPath, { createEditor(item) })
            }
          }

          cell.children.addAll(nodesFromObject(item))
        }
      }
    }
  }

  protected abstract val creatorPath: String
  protected abstract val editorPath: String
  protected abstract fun nodesFromObject(obj: T): List<Node>
  protected abstract fun createAdder(): Any
  protected abstract fun createEditor(obt: T): Any
  protected abstract val objects: List<T>

}