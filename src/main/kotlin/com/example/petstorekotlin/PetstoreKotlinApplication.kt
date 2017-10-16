package com.example.petstorekotlin

import com.example.petstorekotlin.model.data.Pet
import com.example.petstorekotlin.model.service.PetService
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Import
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableSwagger2
@Import(springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration::class)
class PetstoreKotlinApplication {

    @Bean
    fun initializer(petService: PetService) = ApplicationRunner {
        arrayOf("Josh", "Beethoven", "Cerbero", "Lazy",
                "Kelly", "Gus", "Rocky", "Cujo")
                .forEach { name -> petService.save(Pet(petName = name)) }

        petService.findAll().forEach { println(it) }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(PetstoreKotlinApplication::class.java, *args)
}
