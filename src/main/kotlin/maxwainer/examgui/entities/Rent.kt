package maxwainer.examgui.entities

import jakarta.persistence.*
import maxwainer.examgui.common.Identifiable
import java.sql.Date
import java.time.LocalDate

@Table(name = "rent")
@Entity
open class Rent : Identifiable<Int?> {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "rent_id", nullable = false)
  override var identifier: Int? = null

  @JoinColumn(name = "rent_id")
  @OneToOne(targetEntity = Renter::class)
  open var renter: Renter? = null

  @Column(name = "name", nullable = false)
  open var name: String? = null

  @JoinColumn(name = "employer_id")
  @OneToOne(targetEntity = Employer::class)
  open var employer: Employer? = null

  @JoinColumn(name = "pavilion_id")
  @OneToOne(targetEntity = Pavilion::class)
  open var pavilion: Pavilion? = null

  @Column(name = "status", nullable = false)
  open var status: String? = null

  @Column(name = "rent_start", nullable = false)
  open var rentStart: LocalDate? = null

  @Column(name = "rent_end", nullable = false)
  open var rentEnd: LocalDate? = null

}