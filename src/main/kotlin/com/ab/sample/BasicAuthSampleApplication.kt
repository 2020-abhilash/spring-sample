package com.ab.sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BasicAuthSampleApplication

fun main(args: Array<String>) {
	runApplication<BasicAuthSampleApplication>(*args)
}
