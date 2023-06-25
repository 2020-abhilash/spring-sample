package com.ab.sample.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {
    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
