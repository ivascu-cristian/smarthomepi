package com.smarthome.smarthomepi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SmarthomepiApplication

fun main(args: Array<String>) {
    runApplication<SmarthomepiApplication>(*args)
}

