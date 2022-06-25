package maxwainer.examgui.page.manager

import javafx.scene.control.Label
import javafx.stage.Stage
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.entities.Center
import maxwainer.examgui.entities.Employer
import maxwainer.examgui.module.entity.CenterService
import maxwainer.examgui.page.manager.add.CenterAddPage
import maxwainer.examgui.page.manager.display.ObjectViewingManagerPage
import maxwainer.examgui.page.model.implementation.center.toImageView

class CenterManagerPage(override val employer: Employer) :
  ObjectViewingManagerPage<Center>(employer) {

  private val primaryStage by define<Stage>()

  private val centersService by define<CenterService>()

  override val creatorPath = "new-center"
  override val editorPath = "edit-center"

  override fun createAdder() = CenterAddPage(employer)

  override val objects = centersService.all()

  override fun createEditor(obt: Center): Any {
    TODO("Not yet implemented")
  }

  // show all Center object fields via Label
  override fun nodesFromObject(obj: Center) = listOf(
    Label(
      listOf(
        "Name: ${obj.name}",
        "Status: ${obj.status}",
        "Pavilion count: ${obj.pavilionCount}",
        "City: ${obj.city}",
      ).joinToString("\n")
    ),
    Label(
      listOf(
        "Price: ${obj.price}",
        "Value factor: ${obj.valueFactor}",
        "Floor count: ${obj.floorCount}"
      ).joinToString("\n")
    ),
    obj.image!!.toImageView,
  )


}