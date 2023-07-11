package com.example.springredisheroku.model

import com.example.springredisheroku.repository.PersonRepository
import com.example.springredisheroku.service.PersonService
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 11/07/23
 */
@SpringBootTest
class PersonTest {

    @Autowired
    lateinit var personService: PersonService

//    @Test
    fun listPersons() {
        val persons = personService.listPersons()
        assertEquals(2, persons.size)
    }
}