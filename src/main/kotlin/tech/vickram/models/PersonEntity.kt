package tech.vickram.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Person(
    @Id @GeneratedValue var  id: Int = 0,
    var name: String = "",
    var age: Int = 0
)
