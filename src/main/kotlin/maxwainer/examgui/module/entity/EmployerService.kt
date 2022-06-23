package maxwainer.examgui.module.entity

import maxwainer.examgui.entities.Employer

class EmployerService : AbstractCRUDBase<Int, Employer>("employers") {
  override fun all(key: Int?, limit: Long): Iterable<Employer> = sessionProvider.openSession {
    it.createNativeQuery("SELECT * FROM employers", Employer::class.java).resultList.map { e -> e as Employer }
  }

}