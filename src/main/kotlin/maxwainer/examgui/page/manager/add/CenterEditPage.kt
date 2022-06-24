package maxwainer.examgui.page.manager.add

import javafx.fxml.Initializable
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Center
import maxwainer.examgui.module.entity.CenterService
import java.net.URL
import java.util.*

class CenterEditPage(private val center: Center): Initializable {

  private val centerService by define<CenterService>()

  override fun initialize(location: URL?, resources: ResourceBundle?) {

  }


}