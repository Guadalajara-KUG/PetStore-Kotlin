package com.example.petstorekotlin.model.repository

import com.example.petstorekotlin.model.data.Pet
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface PetRepository : CrudRepository<Pet, Long> {

    @Query("select u from Pet u where u.status = ?1")
    fun findByStatus(status: String) : MutableIterable<Pet>
}