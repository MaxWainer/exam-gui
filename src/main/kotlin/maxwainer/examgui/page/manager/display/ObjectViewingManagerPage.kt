package maxwainer.examgui.page.manager.display

import javafx.collections.FXCollections
import javafx.fxml.FXML
import javafx.scene.control.TableView
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
  protected lateinit var objectsTableView: TableView<T>

  @FXML
  private fun onCreateClick() {
    openPage(creatorPath, { createAdder() })
  }

  @FXML
  private fun onEditClick() {
    openPage(editorPath, { createEditor(objectsTableView.selectionModel.selectedItem) })
  }

  override fun initialize(location: URL?, resources: ResourceBundle?) {
    CompletableFuture
      .supplyAsync { objects }
      .thenAccept {
        objectsTableView.items = FXCollections.observableList(it)
      }.join()

    initColumnMappers()
  }

  protected abstract val creatorPath: String
  protected abstract val editorPath: String
  protected abstract fun createAdder(): Any
  protected abstract fun createEditor(obt: T): Any
  protected abstract val objects: List<T>
  protected abstract fun initColumnMappers()

}