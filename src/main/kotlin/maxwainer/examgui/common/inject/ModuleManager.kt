package maxwainer.examgui.common.inject

import kotlin.reflect.KType
import kotlin.reflect.full.createType
import kotlin.reflect.full.isSubtypeOf

internal object ModuleManager {

  private val registeredModules = mutableListOf<DependencyModule>()

  fun registerModule(module: DependencyModule) {
    registeredModules.add(module)
  }

  fun findByType(type: KType) = registeredModules
    .flatMap { it.dependencies }
    .first { it::class.createType().isSubtypeOf(type) }

}