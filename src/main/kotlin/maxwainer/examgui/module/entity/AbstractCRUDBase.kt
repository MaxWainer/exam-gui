//package maxwainer.examgui.module.entity
//
//import maxwainer.examgui.common.Identifiable
//import maxwainer.examgui.common.inject.delegate.define
//import maxwainer.examgui.module.session.DbSessionProvider
//
//abstract class AbstractCRUDBase<K : Any, V>
//  (private val tableName: String) : CRUDBase<K, V> where V : Any,
//                                                         V : Identifiable<K> {
//
//  private val sessionProvider by define<DbSessionProvider>()
//
//  override fun create(value: V) {
//
//  }
//
//  override fun all(key: K?, limit: Long): Iterable<V> {
//    TODO("Not yet implemented")
//  }
//
//  override fun firstByKey(key: K): V? {
//    TODO("Not yet implemented")
//  }
//
//  override fun allByKey(key: K): Iterable<V> {
//    TODO("Not yet implemented")
//  }
//
//  override fun byColumn(name: String, value: Any): V? {
//    TODO()
//  }
//
//  override fun allByColumn(name: String, value: Any): Iterable<V> {
//    TODO()
//  }
//
//  override fun deleteAll() {
//    TODO("Not yet implemented")
//  }
//
//  override fun delete(value: V): Iterable<V> {
//    TODO("Not yet implemented")
//  }
//
//  override fun deleteByKey(key: K): V? {
//    TODO("Not yet implemented")
//  }
//
//  override fun update(value: V): V {
//    TODO("Not yet implemented")
//  }
//}