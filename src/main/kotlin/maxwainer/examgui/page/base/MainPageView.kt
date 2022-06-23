package maxwainer.examgui.page.base

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.TableView
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Center
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.module.entity.CenterService
import java.net.URL
import java.util.*

class MainPageView : Initializable {

  lateinit var employer: Employer

  private val centerService by define<CenterService>()

  @FXML
  private lateinit var centerView: TableView<Center>

  override fun initialize(location: URL?, resources: ResourceBundle?) {
    for (center in centerService.all()) {
    }
  }

}