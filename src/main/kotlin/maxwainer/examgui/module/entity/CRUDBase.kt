package maxwainer.examgui.module.entity

import maxwainer.examgui.common.Identifiable

interface CRUDBase<K, V> where V : Any,
                                     V : Identifiable<K> {

  // create
  fun create(value: V)

  // read
  fun all(key: K? = null, limit: Int = -1): Iterable<V>

  fun firstByKey(key: K): V?

  fun byColumn(name: String, value: Any): V?

  fun allByColumn(name: String, value: Any): Iterable<V>

  // update
  fun update(value: V): V

  // delete
  fun deleteByKey(key: K)

  fun delete(value: V)

}