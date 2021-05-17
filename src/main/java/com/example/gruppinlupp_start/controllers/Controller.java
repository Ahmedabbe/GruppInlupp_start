package com.example.gruppinlupp_start.controllers;

import com.example.gruppinlupp_start.models.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;


@RestController
//@RequestMapping("/demo")
public class Controller {

    private String template = "Hello, %s!";
    private AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
