package maxwainer.examgui.common

import maxwainer.examgui.common.inject.DependencyInjector
import maxwainer.examgui.common.inject.Inject
import maxwainer.examgui.common.inject.Provider
import maxwainer.examgui.common.inject.createInjector

fun main() {

    val injector = createInjector {
        registerInstance(MainModule())
        registerInstance(AnotherModule())
        registerProvider(String::class, ProviderTest())
    }

    val module = injector.getInstance(MainModule::class)
    val anotherModule = injector.getInstance(AnotherModule::class)
    //val strProvider = injector.getInstance(String::class)

    //println(strProvider)

    module.call()
    anotherModule.method()
    anotherModule.checkModule()
    //anotherModule.checkProvider()
}

class ProviderTest : Provider<String> {

    @Inject
    lateinit var injector: DependencyInjector

    override fun get() = "Clazz: ${injector.javaClass}"
}

class MainModule {

    @Inject
    lateinit var anotherModule: AnotherModule

    fun call() {
        anotherModule.method()
    }

}

class AnotherModule {

    @Inject
    lateinit var firstModule: MainModule

    @Inject
    lateinit var dependencyInjector: DependencyInjector

    fun method() {
        println("Test")
    }

    fun checkModule() {
        println("Main module $firstModule")
    }

    fun checkProvider() {
        println(dependencyInjector.getInstance(String::class))
    }

}