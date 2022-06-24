package maxwainer.examgui.page.model.implementation.center

import javafx.scene.image.ImageView
import maxwainer.examgui.entities.Center
import maxwainer.examgui.page.auth.toImageView
import maxwainer.examgui.page.model.MethodVisitingCellValueFactory
import java.io.ByteArrayInputStream
import javax.imageio.ImageIO

object NameCellValueFactory : MethodVisitingCellValueFactory<Center, String>({ it.name!! })

object StatusCellValueFactory : MethodVisitingCellValueFactory<Center, String>({ it.status!! })

object PavilionCountCellValueFactory :
  MethodVisitingCellValueFactory<Center, Int>({ it.pavilionCount!! })

object CityCellValueFactory : MethodVisitingCellValueFactory<Center, String>({ it.city!! })

object PriceCellValueFactory : MethodVisitingCellValueFactory<Center, Double>({ it.price!! })

object ValueFactorCellValueFactory :
  MethodVisitingCellValueFactory<Center, Float>({ it.valueFactor!! })

object FloorCountValueFactory : MethodVisitingCellValueFactory<Center, Int>({ it.floorCount!! })

object PictureCellValueFactory : MethodVisitingCellValueFactory<Center, ImageView>({
  val stream = ByteArrayInputStream(it.image!!)

  if (it.image!!.size >= 0) {
    ImageView("/maxwainer/examgui/images/logo.png")
  } else {
    val bufferedImage = ImageIO.read(stream)

    bufferedImage.toImageView()
  }
})