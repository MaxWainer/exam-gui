package maxwainer.examgui.common

import maxwainer.examgui.common.inject.DependencyInjector
import maxwainer.examgui.common.inject.Inject
import maxwainer.examgui.common.inject.Provider
import maxwainer.examgui.common.inject.createInjector

fun main() {

    val injector = createInjector {
        registerInstance(MainModule())
        registerInstance(AnotherModule())
        registerProvider(String::class.java, ProviderTest())
    }

    val module = injector.getInstance(MainModule::class)
    val anotherModule = injector.getInstance(AnotherModule::class)
    val string = injector.getInstance(String::class)

    module.call()
    anotherModule.method()
    anotherModule.checkModule()
    println(string)
}

class ProviderTest : Provider<String> {
    override fun invoke(injector: DependencyInjector) = "Clazz: ${injector.javaClass}"
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

    fun method() {
        println("Test")
    }

    fun checkModule() {
        println("Main module $firstModule")
    }

}