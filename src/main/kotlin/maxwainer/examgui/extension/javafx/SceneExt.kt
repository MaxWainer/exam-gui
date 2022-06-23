package maxwainer.examgui.extension.javafx

import javafx.stage.Stage

fun Stage.fixTo(width: Double, height: Double) {
  this.width = width
  this.height = height
  this.isResizable = false
}