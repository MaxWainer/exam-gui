package maxwainer.examgui.crud

interface CRUDBase<K, V> {

  fun findById(key: K): V?

  fun remove(v: V)

  fun removeById(key: K)

}