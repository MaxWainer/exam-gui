package maxwainer.examgui.extension.javafx

import javafx.scene.control.Alert

fun errorAlert(during: String, message: String) {
  val alert = Alert(Alert.AlertType.ERROR)

  alert.isResizable = false
  alert.headerText = "Error during $during"
  alert.contentText = message

  alert.show()
}

fun authErrorAlert(message: String) {
  errorAlert("Authentication", message)
}