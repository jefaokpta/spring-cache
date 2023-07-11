package com.example.springredisheroku.service

import com.example.springredisheroku.model.Person
import com.example.springredisheroku.repository.PersonRepository
import org.springframework.cache.annotation.CacheEvict
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import java.util.*

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 11/07/23
 */
@Service
class PersonService(private val personRepository: PersonRepository) {

    fun listPersons(): List<Person> {
        println("listPersons")
        return personRepository.findAll().toList()
    }

    @Cacheable("person")
    fun findPersonById(id: Long): Optional<Person> {
        println("findPersonById $id")
        return personRepository.findById(id)
    }

    @CacheEvict("person", allEntries = true)
    fun savePerson(): Person {
        return personRepository.save(Person(0,System.currentTimeMillis().toString(), 30))
    }

}