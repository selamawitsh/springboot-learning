package com.selam.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Selamawit! Welcome to Spring Boot";
    }

    @GetMapping("/hello/{name}")
    public String helloWithName(@PathVariable String name) {
        return "Hello " + name + "! Nice to meet you.";
    }

    @GetMapping("/user")
    public User getUser(@RequestParam String name,
                        @RequestParam(defaultValue = "25") int age) {

        String msg = "Welcome to Spring Boot from Selamawit's first API!";
        return new User(name, age, msg);
    }
}