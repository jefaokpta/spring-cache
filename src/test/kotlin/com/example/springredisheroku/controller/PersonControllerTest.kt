package com.example.springredisheroku.controller

import com.example.springredisheroku.service.PersonService
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 11/07/23
 */
@SpringBootTest
class PersonControllerTest {

    @Autowired
    lateinit var personService: PersonService

//    @Test
    fun findPersonById() {
        val person = personService.findPersonById(1)
        assertEquals("John", person.name)
    }
}