package maxwainer.examgui.common.inject

fun createModule(builder: DependencyModule.() -> Unit) {
  val impl = DependencyModuleImpl()

  impl.apply(builder)

  ModuleManager.registerModule(impl)
}

interface DependencyModule {

  val dependencies: MutableList<Injectable>

  fun add(injectable: Injectable)

}

private class DependencyModuleImpl : DependencyModule {
  override val dependencies: MutableList<Injectable> = mutableListOf()

  override fun add(injectable: Injectable) {
    dependencies.add(injectable)
  }

}