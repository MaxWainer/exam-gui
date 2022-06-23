package maxwainer.examgui.module.entity

import jakarta.persistence.criteria.Expression
import jakarta.persistence.criteria.Predicate
import maxwainer.examgui.common.Identifiable
import maxwainer.examgui.common.inject.delegate.define
import maxwainer.examgui.module.session.DbSessionProvider
import org.hibernate.Session
import org.hibernate.query.Query
import org.hibernate.query.criteria.JpaCriteriaQuery
import org.hibernate.query.criteria.JpaRoot
import kotlin.reflect.KClass

abstract class AbstractCRUDBase<K, V>(private val klass: KClass<V>)
  : CRUDBase<K, V> where V : Any,
                         V : Identifiable<K> {

  private val sessionProvider by define<DbSessionProvider>()

  override fun create(value: V) {
    sessionProvider.openSession {
      it.persist(value)
    }
  }

  override fun all(key: K?, limit: Int) = sessionProvider.openSession {
    it.selectQuery { _, root, query ->
      if (limit > 0)
        query.maxResults = limit

      if (key != null)
        query.setParameter(0, key)
    }.resultList
  }

  override fun firstByKey(key: K) = sessionProvider.openSession {
    it.selectQuery { _, root, query ->
      query.setParameter(0, key)
    }.singleResult
  }

  override fun byColumn(name: String, value: Any) = sessionProvider.openSession {
    it.createQuery("from ${klass.simpleName} where $name = :value", klass.java)
      .setParameter("value", value)
      .singleResultOrNull
  }

  override fun allByColumn(name: String, value: Any) = sessionProvider.openSession {
    it.createQuery("from ${klass.simpleName} where $name = :value", klass.java)
      .setParameter("value", value)
      .resultList
  }

  override fun delete(value: V) = sessionProvider.openSession {
    it.remove(value)
  }

  override fun deleteByKey(key: K) = sessionProvider.openSession {
    val result = firstByKey(key)

    it.remove(result)
  }

  override fun update(value: V) = sessionProvider.openSession {
    it.evict(value)
    it.merge(value)

    value
  }

  private fun Session.createQuery(
    preMapper: (JpaCriteriaQuery<V>) -> JpaRoot<V>,
    mapper: (JpaCriteriaQuery<V>, JpaRoot<V>, Query<V>) -> Unit): Query<V> {
    val criteriaBuilder = this.criteriaBuilder
    val criteriaQuery = criteriaBuilder.createQuery(klass.java)
    val root = preMapper(criteriaQuery)
    val query = this.createQuery(criteriaQuery)

    mapper(criteriaQuery, root, query)

    return query
  }

  private fun Session.selectQuery(
    mapper: (JpaCriteriaQuery<V>, JpaRoot<V>, Query<V>) -> Unit): Query<V> =
    createQuery({ it.from(klass.java) }, mapper)
}