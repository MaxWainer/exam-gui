package maxwainer.examgui.common.inject.visitor

import java.lang.invoke.MethodHandle
import java.lang.reflect.Field

interface FieldVisitor {

    fun visitField(clazz: Class<*>, instance: Any, field: Field, handle: MethodHandle)

    fun isVisitable(field: Field): Boolean

}