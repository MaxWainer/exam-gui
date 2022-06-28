package maxwainer.examgui.page.manager.display

import javafx.collections.FXCollections
import javafx.fxml.FXML
import javafx.geometry.Insets
import javafx.scene.Node
import javafx.scene.control.*
import javafx.scene.layout.GridPane
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.extension.javafx.errorAlert
import maxwainer.examgui.page.AbstractPage
import maxwainer.examgui.page.EmployerDependPage
import java.net.URL
import java.util.*

abstract class ObjectViewingPage<T, S : SortingOption>
  (employer: Employer) : AbstractBackingPage(employer) {

  @FXML
  protected lateinit var objectsView: ListView<T>

  @FXML
  protected lateinit var editButton: Button

  @FXML
  protected lateinit var sortTypeBox: ComboBox<S>

  @FXML
  protected lateinit var sortingBox: ComboBox<String>

  @FXML
  private fun onCreateClick() {
    openPage(creatorPath, { createAdder() })
  }

  @FXML
  private fun onEditClick() {
    val selected = objectsView.selectionModel.selectedItem

    if (selected == null) {
      errorAlert("No object selected", "Please select an object to edit")
      return
    }

    openPage(editorPath, { createEditor(selected) })
  }

  override fun initialize(location: URL?, resources: ResourceBundle?) {
    objectsView.items = FXCollections.observableList(objects)
    objectsView.selectionModel.selectionMode = SelectionMode.SINGLE

    objectsView.selectionModel.selectedItemProperty().addListener { _, _, newValue ->
      editButton.isDisable = newValue == null
    }

    sortTypeBox.items.addAll(sortTypes)
    sortTypeBox.setCellFactory {
      object : ListCell<S>() {
        override fun updateItem(item: S?, empty: Boolean) {
          super.updateItem(item, empty)
          if (item != null) {
            text = item.displayName
          }
        }
      }
    }

    sortTypeBox
      .selectionModel
      .selectedItemProperty()
      .addListener { _, _, newValue ->
        if (newValue != null) {
          sortingBox.items.clear()
          sortingBox.items.addAll(
            showAvailable(newValue, objects)
          )
        }
      }

    sortingBox
      .selectionModel
      .selectedItemProperty()
      .addListener { _, _, newValue ->
        if (newValue != null) {
          objectsView.items.clear()
          objectsView.items.addAll(
            sort(sortTypeBox.selectionModel.selectedItem, newValue, objects)
          )
        }
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

  protected abstract val sortTypes: Array<S>
  protected abstract val creatorPath: String
  protected abstract val editorPath: String
  protected abstract val objects: List<T>
  protected abstract fun nodesFromObject(obj: T): List<Node>
  protected abstract fun createAdder(): Any
  protected abstract fun createEditor(obj: T): Any
  protected abstract fun sort(option: S, sortValue: String, sortable: List<T>): List<T>
  protected abstract fun showAvailable(option: S, sortable: List<T>): List<String>

}

interface SortingOption {

  val displayName: String

}