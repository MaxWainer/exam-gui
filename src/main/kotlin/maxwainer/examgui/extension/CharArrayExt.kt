package maxwainer.examgui.extension

fun CharArray.randomString(size: Int) = buildString {
  repeat(size) { append(this@randomString.random()) }
}