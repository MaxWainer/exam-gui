package maxwainer.examgui.page.manager.add

import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Center
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.module.entity.CenterService
import maxwainer.examgui.page.AbstractPage
import maxwainer.examgui.page.EmployerDependPage
import java.net.URL
import java.util.*

class CenterEditPage(private val center: Center, override val employer: Employer) : AbstractPage(),
  EmployerDependPage {

  private val centerService by define<CenterService>()

  override fun initialize(location: URL?, resources: ResourceBundle?) {

  }


}