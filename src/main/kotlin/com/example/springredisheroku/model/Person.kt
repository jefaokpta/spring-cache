package com.example.springredisheroku.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 11/07/23
 */
@Table("PERSONS")
data class Person(
    @Id
    val id: Long,
    val name: String,
    val age: Int
) {
}