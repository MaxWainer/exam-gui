package maxwainer.examgui.common.inject.delegate

import maxwainer.examgui.common.inject.Injectable
import maxwainer.examgui.common.inject.ModuleManager
import kotlin.reflect.KProperty

fun <T : Injectable> define(): InjectedDependency<T> = InjectedDependencyImpl()

interface InjectedDependency<T : Any> {

  operator fun getValue(thisRef: Any?, property: KProperty<*>): T

}

private class InjectedDependencyImpl<T : Any> : InjectedDependency<T> {
  @Suppress("UNCHECKED_CAST")
  override fun getValue(thisRef: Any?, property: KProperty<*>) =
    ModuleManager.findByType(property.returnType) as T
}