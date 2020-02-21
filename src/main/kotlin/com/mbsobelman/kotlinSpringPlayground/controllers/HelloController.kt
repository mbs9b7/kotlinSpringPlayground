package com.mbsobelman.kotlinSpringPlayground.controllers

import com.mbsobelman.kotlinSpringPlayground.Hello
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController {
    val counter = AtomicLong()

    @GetMapping("/hello")
    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String) = Hello(counter.incrementAndGet(), "Hello $name")
}