package maxwainer.examgui.common.inject.delegate

import maxwainer.examgui.common.inject.ModuleManager
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty
import kotlin.reflect.javaType

typealias AnyReadOnlyProperty<T> = ReadOnlyProperty<Any, T>

fun <T : Any> define(): AnyReadOnlyProperty<T> = DefinableProperty()

private class DefinableProperty<T : Any> : AnyReadOnlyProperty<T> {
  @Suppress("UNCHECKED_CAST")
  override fun getValue(thisRef: Any, property: KProperty<*>) =
    ModuleManager.findByType(property.returnType) as T
}