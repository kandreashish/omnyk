package com.omnyk.v2.omnyk

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class OmnykApplication

fun main(args: Array<String>) {
    runApplication<OmnykApplication>(*args)
    println("Hello world")
}



