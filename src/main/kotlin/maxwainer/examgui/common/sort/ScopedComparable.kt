package maxwainer.examgui.common.sort

interface ScopedComparable<E : Enum<E>, T> {

  fun compareScoped(scope: E, other: T): Int

  fun asComparable(scope: E) = object : Comparable<T> {
    override fun compareTo(other: T) = compareScoped(scope, other)
  }

}