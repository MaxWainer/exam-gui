package maxwainer.examgui.entities

import jakarta.persistence.*
import maxwainer.examgui.common.Identifiable

@Entity
@Table(name = "pavilions")
open class Pavilion : Identifiable<Int?> {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "pavilion_id", nullable = false)
  override var identifier: Int? = null

  @JoinColumn(name = "center_id")
  @OneToOne(targetEntity = Center::class)
  open var center: Center? = null

  @Column(name = "pavilion_number", nullable = false)
  open var pavilionNumber: String? = null

  @Column(name = "floor", nullable = false)
  open var floor: Int? = null

  @Column(name = "status", nullable = false)
  open var status: String? = null

  @Column(name = "square", nullable = false)
  open var squares: Int? = null

  @Column(name = "price_per_square", nullable = false)
  open var pricePerSquare: Double? = null

  @Column(name = "value_factor", nullable = false)
  open var valueFactor: Float? = null

}