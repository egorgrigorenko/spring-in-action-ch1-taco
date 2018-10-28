package tacos

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TacoCloudApplication

fun main(args: Array<String>) {
    SpringApplication.run(TacoCloudApplication::class.java, *args)
}