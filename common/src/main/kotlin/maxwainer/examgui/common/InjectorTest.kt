package maxwainer.examgui.common

import maxwainer.examgui.common.inject.createModule
import maxwainer.examgui.common.inject.delegate.define

fun main() {

  createModule {
    add(TestInjectable())
  }

  val test = TestModule()

  test.doSmth()
}

class TestModule {

  private val test by define<TestInjectable>()

  fun doSmth() {
    test.call()
    println("Yup")
  }

}

class TestInjectable {

  fun call() {
    println("Kek")
  }

}