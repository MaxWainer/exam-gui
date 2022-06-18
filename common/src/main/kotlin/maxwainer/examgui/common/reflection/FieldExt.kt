package maxwainer.examgui.common.reflection

import java.lang.reflect.Field
import java.lang.reflect.Modifier

val Field.isVar
    get() = Modifier.isFinal(this.modifiers)

val Field.isVal
    get() = !isVar