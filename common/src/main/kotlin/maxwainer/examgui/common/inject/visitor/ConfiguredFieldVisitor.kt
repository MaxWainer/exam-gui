package maxwainer.examgui.common.inject.visitor

import maxwainer.examgui.common.inject.DependencyConfigurator
import maxwainer.examgui.common.inject.DependencyInjector
import maxwainer.examgui.common.inject.Inject
import java.lang.invoke.MethodHandle
import java.lang.reflect.Field

class ConfiguredFieldVisitor(
    private val injector: DependencyInjector,
    private val configurator: DependencyConfigurator) : FieldVisitor {

    override fun visitField(clazz: Class<*>, instance: Any, field: Field, handle: MethodHandle) {
        val factory = configurator.registeredDependencies[field.type] ?: return

        handle.bindTo(instance).invoke(factory(injector))
    }

    override fun isVisitable(field: Field) = field.getAnnotation(Inject::class.java) != null
}