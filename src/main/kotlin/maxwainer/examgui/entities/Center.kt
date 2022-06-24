package maxwainer.examgui.entities

import jakarta.persistence.*
import maxwainer.examgui.common.Identifiable

@Entity
@Table(name = "centers")
open class Center : Identifiable<Int?> {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "center_id", nullable = false)
  override var identifier: Int? = null

  @Column(name = "name", nullable = false)
  open var name: String? = null

  @Column(name = "status", nullable = false)
  open var status: String? = null

  @Column(name = "pavilion_count", nullable = false)
  open var pavilionCount: Int? = null

  @Column(name = "city", nullable = false)
  open var city: String? = null

  @Column(name = "price", nullable = false)
  open var price: Double? = null

  @Column(name = "value_factor", nullable = false)
  open var valueFactor: Float? = null

  @Column(name = "floor_count", nullable = false)
  open var floorCount: Int? = null

  @Lob
  @Column(name = "picture", nullable = false)
  open var image: ByteArray? = null

}