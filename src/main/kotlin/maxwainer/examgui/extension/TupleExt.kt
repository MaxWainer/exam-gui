package maxwainer.examgui.extension

infix fun <T> Pair<T, T>.toTr(t: T) = Triple(first, second, t)