package com.mbsobelman.kotlinSpringPlayground.controllers

import com.mbsobelman.kotlinSpringPlayground.Hello
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


@RestController
class HelloController {
    val counter = AtomicLong()

    @GetMapping("/hello")
    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String) = Hello(counter.incrementAndGet(), "Hello $name")

    //can I add a second one here? yes I can
    @GetMapping("/hello2")
    fun hello2(@RequestParam(value = "name") name: String, @RequestParam(value = "greeting") greeting: String): String {
        return "$greeting, $name"
    }
}