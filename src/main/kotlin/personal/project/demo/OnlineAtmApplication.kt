package personal.project.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OnlineAtmApplication

fun main(args: Array<String>) {
	runApplication<OnlineAtmApplication>(*args)
}
