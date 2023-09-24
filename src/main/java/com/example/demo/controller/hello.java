package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/demo/hello")
public class hello {

    @GetMapping("/test")
    public String getMessage(){
        return "Hello";
    }

    @GetMapping("/helloworld")
    public String getHelloWorld(){
        return "HelloWorldTest7";
    }
}
