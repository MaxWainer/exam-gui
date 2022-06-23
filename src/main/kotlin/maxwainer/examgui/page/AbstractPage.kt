package maxwainer.examgui.page

abstract class AbstractPage {

  protected fun <T> openPage(page: String, preprocessor: (T) -> Unit = {}): T {
    TODO()
  }

}