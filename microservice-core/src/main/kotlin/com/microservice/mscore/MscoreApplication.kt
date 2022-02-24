package com.microservice.mscore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MscoreApplication

fun main(args: Array<String>) {
	runApplication<MscoreApplication>(*args)
}
