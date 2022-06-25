package maxwainer.examgui.entities

import jakarta.persistence.*
import maxwainer.examgui.common.Identifiable
import maxwainer.examgui.common.sort.ScopedComparable
import java.sql.Blob

@Table(name = "employers")
@Entity
open class Employer : Identifiable<Int?> {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "employer_id", nullable = false)
  override var identifier: Int? = null

  @Column(name = "name", nullable = false)
  open var name: String? = null

  @Column(name = "second_name", nullable = false)
  open var secondName: String? = null

  @Column(name = "patronymic", nullable = false)
  open var patronymic: String? = null

  @Column(name = "password", nullable = false)
  open var password: String? = null

  @Column(name = "role", nullable = false)
  open var role: String? = null

  @Column(name = "phone_number", nullable = false)
  open var phoneNumber: String? = null

  @Column(name = "sex", nullable = false)
  open var sex: String? = null

  @Column(name = "login", nullable = false)
  open var login: String? = null

  @Lob
  @Column(name = "photo", nullable = false)
  open var photo: Blob? = null
  override fun toString() =
    "Employer(identifier=$identifier, name=$name, secondName=$secondName, patronymic=$patronymic, password=$password, role=$role, phoneNumber=$phoneNumber, sex=$sex, login=$login, photo=$photo)"
}