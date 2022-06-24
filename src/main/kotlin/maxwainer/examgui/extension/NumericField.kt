package maxwainer.examgui.extension

import javafx.scene.control.TextField

fun TextField.asNumeric() {
  textProperty().addListener { _, _, newValue ->
    if (newValue.isNotEmpty() && newValue.toDoubleOrNull() == null) {
      text = newValue.dropLast(1)
    }
  }
}
