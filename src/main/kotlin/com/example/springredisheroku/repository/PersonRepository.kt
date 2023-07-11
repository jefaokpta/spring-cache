package com.example.springredisheroku.repository

import com.example.springredisheroku.model.Person
import org.springframework.data.repository.CrudRepository

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 11/07/23
 */
interface PersonRepository: CrudRepository<Person, Long> {
}