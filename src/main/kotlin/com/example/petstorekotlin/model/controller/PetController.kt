package com.example.petstorekotlin.model.controller


import com.example.petstorekotlin.model.service.PetService
import org.springframework.web.bind.annotation.*

@RestController
class PetController(var petService: PetService) {

    @GetMapping("/pets")
    fun findAll() = petService.findAll()

    @GetMapping("/pets/{id}")
    fun findById(@PathVariable id : Long) = petService.findById(id)

    @GetMapping("/pets/findByStatus")
    fun findByStatus(@RequestParam("status") status: String) = petService.findByStatus(status)

    @DeleteMapping("/pets/{id}")
    fun delete(@PathVariable id: Long) = petService.delete(id)
}