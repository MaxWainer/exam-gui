package maxwainer.examgui.extension

import javafx.scene.control.TextField

fun TextField.asNumeric(allowNegative: Boolean = false) {
  textProperty().addListener { _, _, newValue ->
    if (allowNegative) {
      if (!newValue.matches("-?\\d*(\\.\\d*)?".toRegex())) {
        text = newValue.replaceFirst("[^-\\d\\.]".toRegex(), "")
      }
    } else {
      if (!newValue.matches("\\d*(\\.\\d*)?".toRegex())) {
        text = newValue.replaceFirst("[^\\d\\.]".toRegex(), "")
      }
    }
  }
}
