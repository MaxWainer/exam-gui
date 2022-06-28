package maxwainer.examgui.page.manager.display

import javafx.collections.FXCollections
import javafx.fxml.FXML
import javafx.geometry.Insets
import javafx.scene.Node
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.ListCell
import javafx.scene.control.ListView
import javafx.scene.control.SelectionMode
import javafx.scene.layout.GridPane
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.page.AbstractPage
import maxwainer.examgui.page.EmployerDependPage
import java.net.URL
import java.util.*

abstract class ObjectViewingPage<T, S : SortingOption>
  (override val employer: Employer) :
  AbstractPage(), EmployerDependPage {

  @FXML
  protected lateinit var objectsView: ListView<T>

  @FXML
  protected lateinit var editButton: Button

  @FXML
  private fun onCreateClick() {
    openPage(creatorPath, { createAdder() })
  }

  override fun initialize(location: URL?, resources: ResourceBundle?) {
    objectsView.items = FXCollections.observableList(objects)
    objectsView.selectionModel.selectionMode = SelectionMode.SINGLE
    objectsView.selectionModel.selectedItemProperty().addListener { _, _, newValue ->
      editButton.isDisable = newValue == null
    }
    objectsView.setCellFactory {
      val cell = object : ListCell<T?>() {

        override fun updateItem(item: T?, empty: Boolean) {
          super.updateItem(item, empty)
          if (item == null || empty) {
            graphic = Label("Unable to load center (Is empty: $empty, Object: $item)")
            return
          }

          val cell = GridPane()

          cell.setOnMouseClicked {
            if (it.clickCount == 2) {
              openPage(editorPath, { createEditor(item) })
            }
          }

          nodesFromObject(item)
            .forEachIndexed { index, node ->
              cell.addColumn(index, node)
            }

          cell.padding = Insets(10.0, 10.0, 10.0, 10.0)


          graphic = cell
        }
      }

      cell
    }
  }

  protected abstract val creatorPath: String
  protected abstract val editorPath: String
  protected abstract val objects: List<T>
  protected abstract fun nodesFromObject(obj: T): List<Node>
  protected abstract fun createAdder(): Any
  protected abstract fun createEditor(obt: T): Any
  protected abstract fun sort(option: S, sortValue: String, sortable: List<T>): List<T>
  protected abstract fun showAvailable(option: S, sortable: List<T>): List<String>

}

interface SortingOption {

  val displayName: String

}