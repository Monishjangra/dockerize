package com.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test2")
public class Test2 {

    @GetMapping("/hello")
    public String test() {
        return "Hello Docker";
    }

    @GetMapping("/bye")
    public String test1() {
        return "Bye Docker";
    }
}
