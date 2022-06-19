package maxwainer.examgui.common.inject

fun createModule(builder: DependencyModule.() -> Unit) {
  val impl = DependencyModuleImpl()

  impl.apply(builder)

  ModuleManager.registerModule(impl)
}

interface DependencyModule {

  val dependencies: MutableList<Any>

  fun add(injectable: Any)

}

private class DependencyModuleImpl : DependencyModule {
  override val dependencies: MutableList<Any> = mutableListOf()

  override fun add(injectable: Any) {
    dependencies.add(injectable)
  }

}