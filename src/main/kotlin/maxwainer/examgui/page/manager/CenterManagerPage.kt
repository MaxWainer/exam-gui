package maxwainer.examgui.page.manager

import javafx.collections.FXCollections
import javafx.fxml.FXML
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.stage.Stage
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Center
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.module.entity.CenterService
import maxwainer.examgui.page.AbstractPage
import maxwainer.examgui.page.EmployerDependPage
import maxwainer.examgui.page.manager.add.CenterAddPage
import maxwainer.examgui.page.model.implementation.center.*
import java.net.URL
import java.util.*
import java.util.concurrent.CompletableFuture

class CenterManagerPage(override val employer: Employer) : AbstractPage(), EmployerDependPage {

  private val primaryStage by define<Stage>()

  private val centersService by define<CenterService>()

  @FXML
  private lateinit var centerTableView: TableView<Center>

  @FXML
  private lateinit var pavilionCountColumn: TableColumn<Center, Int>

  @FXML
  private lateinit var cityColumn: TableColumn<Center, String>

  @FXML
  private lateinit var priceColumn: TableColumn<Center, Double>

  @FXML
  private lateinit var valueFactorColumn: TableColumn<Center, Float>

  @FXML
  private lateinit var floorCountColumn: TableColumn<Center, Int>

//  @FXML
//  private lateinit var imageColumn: TableColumn<Center, ImageView>

  @FXML
  private lateinit var nameColumn: TableColumn<Center, String>

  @FXML
  private lateinit var statusColumn: TableColumn<Center, String>

  @FXML
  private fun onAddClick() {
    openPage("new-center", { CenterAddPage(employer) })
  }

  override fun initialize(location: URL?, resources: ResourceBundle?) {
    CompletableFuture.supplyAsync { centersService.all() }
      .thenAccept {
        centerTableView.items = FXCollections.observableList(it)
      }.join()

    initColumns()
  }

  private fun initColumns() {
    statusColumn.cellValueFactory = StatusCellValueFactory
    nameColumn.cellValueFactory = NameCellValueFactory

//    imageColumn.cellValueFactory = PictureCellValueFactory
//    imageColumn.cellFactory = ImageCellFactory<Center>()

    pavilionCountColumn.cellValueFactory = PavilionCountCellValueFactory
    cityColumn.cellValueFactory = CityCellValueFactory
    priceColumn.cellValueFactory = PriceCellValueFactory
    valueFactorColumn.cellValueFactory = ValueFactorCellValueFactory
    floorCountColumn.cellValueFactory = FloorCountValueFactory
  }

}