package maxwainer.examgui.extension.javafx

import javafx.beans.property.StringProperty
import javafx.scene.control.TextInputControl

val TextInputControl.textProperty: StringProperty get() = textProperty()
val StringProperty.get: String? get() = get()