package maxwainer.examgui.module.entity

import maxwainer.examgui.entities.*

object EmployerService : AbstractCRUDBase<Int?, Employer>(Employer::class)

object CenterService : AbstractCRUDBase<Int?, Center>(Center::class)

object PavilionService : AbstractCRUDBase<Int?, Pavilion>(Pavilion::class)

object RentService : AbstractCRUDBase<Int?, Rent>(Rent::class)

object RenterService : AbstractCRUDBase<Int?, Renter>(Renter::class)