package maxwainer.examgui.entities

import jakarta.persistence.*

@Entity
@Table(name = "user")
open class User {

    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    var userId: Long? = null

}