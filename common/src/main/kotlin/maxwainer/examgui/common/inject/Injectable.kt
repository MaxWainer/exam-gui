package maxwainer.examgui.common.inject

interface Injectable {

  fun preInject() {
    // let user add some logic here
  }

  fun postInject() {
    // let user add some logic here
  }

}