package maxwainer.examgui.entities

import jakarta.persistence.*
import maxwainer.examgui.common.Identifiable


@Table(name = "renters")
@Entity
open class Renter : Identifiable<Int?> {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "renter_id", nullable = false)
  override var identifier: Int? = null

  @Column(name = "name", nullable = false)
  open var name: String?= null

  @Column(name = "phone", nullable = false)
  open var phone: String? = null

  @Column(name = "address", nullable = false)
  open var address: String? = null

}