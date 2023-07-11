package com.example.springredisheroku.controller

import com.example.springredisheroku.service.PersonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.jvm.optionals.getOrNull

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 11/07/23
 */
@RestController
@RequestMapping("/persons")
class PersonController(private val personService: PersonService) {

    @GetMapping
    fun listPersons() = personService.listPersons()

    @GetMapping("/{id}")
    fun findPersonById(@PathVariable id: String){
        println(personService.findPersonById(1).getOrNull()?.name)
        println(personService.findPersonById(2).getOrNull()?.name)
        println(personService.findPersonById(3).getOrNull()?.name)
        println(personService.findPersonById(4).getOrNull()?.name)
        println(personService.findPersonById(5).getOrNull()?.name)
        println(personService.findPersonById(6).getOrNull()?.name)
        println("-------------------")
    }

    @GetMapping("/save")
    fun savePerson() = personService.savePerson()

}