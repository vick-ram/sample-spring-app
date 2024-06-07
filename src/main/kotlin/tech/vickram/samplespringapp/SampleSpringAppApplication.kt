package tech.vickram.samplespringapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SampleSpringAppApplication

fun main(args: Array<String>) {
    runApplication<SampleSpringAppApplication>(*args)
}
