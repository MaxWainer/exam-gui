package maxwainer.examgui.common.inject

interface Provider<T> {

    operator fun invoke(injector: DependencyInjector): T

}

typealias DependencyFactory = (DependencyInjector) -> Any

interface DependencyConfigurator {

    fun registerInstance(instance: Any)

    fun <T : Any> registerProvider(clazz: Class<T>, provider: Provider<T>)

    val registeredDependencies: Map<Class<*>, DependencyFactory>

}