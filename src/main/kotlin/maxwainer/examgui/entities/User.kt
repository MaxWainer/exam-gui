package maxwainer.examgui.entities

import jakarta.persistence.*
import kotlin.properties.Delegates

@Entity
@Table(name = "user")
open class User {

  @get:Id // we need define use-suit target, in our case, annotation should target on get
  @get:Column(name = "user_id", nullable = false)
  @get:GeneratedValue(strategy = GenerationType.AUTO)
  var userId by Delegates.notNull<Long>()
    //@Id get // it's equivalent to @get:Id

}