package com.example.springredisheroku

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class SpringRedisHerokuApplication

fun main(args: Array<String>) {
    runApplication<SpringRedisHerokuApplication>(*args)
}
