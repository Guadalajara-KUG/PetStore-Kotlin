package com.example.petstorekotlin.model.data

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Pet(
        @Id @GeneratedValue var id: Long? = null,
        var petName: String? = null,
        var status : String? = Status.AVAILABLE.toString()
)

enum class Status { AVAILABLE, PENDING, SOLD }

