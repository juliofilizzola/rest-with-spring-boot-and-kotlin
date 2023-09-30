package br.com.erudio.controller

import br.com.erudio.Greeting
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


@RestController
class GreetingController {
    val counter : AtomicLong = AtomicLong()

    @RequestMapping("/greeting")
    fun greeting(): Greeting {
        return Greeting(counter.incrementAndGet(), "Hello, Kotlin!")
    }

}