package maxwainer.examgui.common.inject

import kotlin.reflect.KType
import kotlin.reflect.full.createType

internal object ModuleManager {

  private val registeredModules = mutableListOf<DependencyModule>()

  fun registerModule(module: DependencyModule) {
    registeredModules.add(module)
  }

  fun findByType(type: KType) = registeredModules
    .flatMap { it.dependencies }
    .first { it.javaClass.kotlin.createType() == type }

}