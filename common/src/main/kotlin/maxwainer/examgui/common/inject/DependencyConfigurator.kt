package maxwainer.examgui.common.inject

import kotlin.reflect.KClass

interface Provider<T : Any> {

    fun get(): T

}

typealias DependencyFactory = () -> Any

interface DependencyConfigurator {

    fun registerInstance(instance: Any)

    fun <T : Any> registerProvider(clazz: Class<T>, provider: Provider<T>)

    fun <T : Any> registerProvider(clazz: KClass<T>, provider: Provider<T>) {
        registerProvider(clazz.java, provider)
    }

    val registeredDependencies: Map<Class<*>, DependencyFactory>

}