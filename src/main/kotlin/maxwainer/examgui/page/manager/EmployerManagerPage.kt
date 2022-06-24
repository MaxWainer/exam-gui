package maxwainer.examgui.page.manager

import maxwainer.examgui.entities.Employer
import maxwainer.examgui.page.AbstractPage
import maxwainer.examgui.page.EmployerDependPage

class EmployerManagerPage(override val employer: Employer) : AbstractPage(), EmployerDependPage {
}