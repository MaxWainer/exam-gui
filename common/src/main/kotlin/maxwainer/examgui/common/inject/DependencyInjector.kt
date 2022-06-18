package maxwainer.examgui.common.inject

import maxwainer.examgui.common.inject.visitor.ConfiguredFieldVisitor
import maxwainer.examgui.common.reflection.createInstance
import maxwainer.examgui.common.reflection.isObject
import maxwainer.examgui.common.reflection.objectInstance
import java.lang.invoke.MethodHandles
import kotlin.reflect.KClass

fun createInjector(builder: DependencyConfigurator.() -> Unit): DependencyInjector {
    val configurator = DependencyConfiguratorImpl()

    return DependencyInjectorImpl(configurator.apply(builder)).selfInject()
}

interface DependencyInjector {

    fun injectDependencies(clazz: Class<*>, instance: Any): Any

    fun injectDependencies(clazz: Class<*>): Any

    fun <T : Any> getInstance(clazz: Class<T>): T

    fun <T : Any> getInstance(clazz: KClass<T>): T = getInstance(clazz.java)

}

private class DependencyConfiguratorImpl : DependencyConfigurator {
    override fun registerInstance(instance: Any) {
        registeredDependencies[instance.javaClass] = { instance }
    }

    override fun <T : Any> registerProvider(clazz: Class<T>, provider: Provider<T>) {
        registeredDependencies[clazz] = { provider.invoke(it) }
    }

    override val registeredDependencies = mutableMapOf<Class<*>, DependencyFactory>()

}

private class DependencyInjectorImpl(private val configurator: DependencyConfigurator) :
    DependencyInjector {

    private val visitor = ConfiguredFieldVisitor(this, configurator)
    private val lookup = MethodHandles.lookup()

    private val injectedInstances = mutableListOf<Any>()

    override fun injectDependencies(clazz: Class<*>, instance: Any): Any {
        if (injectedInstances.contains(instance))
            return instance

        for (declaredField in clazz.declaredFields) {
            if (visitor.isVisitable(declaredField))
                visitor.visitField(
                    clazz,
                    instance,
                    declaredField,
                    lookup.unreflectSetter(declaredField)
                )
        }

        injectedInstances.add(instance)

        return instance
    }

    override fun injectDependencies(clazz: Class<*>): Any {
        injectedInstances
            .firstOrNull { it::class.java == clazz }?.let { return it }

        val instance = if (!clazz.isObject)
            clazz.createInstance
        else
            clazz.objectInstance
                ?: throw UnsupportedOperationException("Unable to create or get instance of class $clazz")

        return injectDependencies(clazz, instance)
    }

    override fun <T : Any> getInstance(clazz: Class<T>) = injectedInstances
        .first { it::class.java == clazz } as T

    fun selfInject() = apply {
        configurator.registeredDependencies.forEach { (clazz, factory) ->
            injectDependencies(clazz, factory(this))
        }
    }

}