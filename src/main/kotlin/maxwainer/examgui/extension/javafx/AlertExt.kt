package maxwainer.examgui.extension.javafx

import javafx.scene.control.Alert

fun infoAlert(title: String, message: String) {
    Alert(Alert.AlertType.INFORMATION, message).apply {
        this.title = title
        this.headerText = null
        this.showAndWait()
    }
}

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