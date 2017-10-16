package com.example.petstorekotlin.model.service

import com.example.petstorekotlin.model.data.Pet
import com.example.petstorekotlin.model.repository.PetRepository
import org.springframework.stereotype.Service

@Service
class PetService(private val petRepository: PetRepository) {
    fun findAll(): MutableIterable<Pet> = petRepository.findAll()

    fun findById(id : Long): Pet = petRepository.findOne(id)

    fun findByStatus(status : String) = petRepository.findByStatus(status)
    
    fun save(pet: Pet?) = petRepository.save(pet)

    fun delete(id: Long) = petRepository.delete(id)

}