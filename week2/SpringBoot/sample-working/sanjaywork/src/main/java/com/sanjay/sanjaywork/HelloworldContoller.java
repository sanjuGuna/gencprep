package com.sanjay.sanjaywork;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldContoller {
    @GetMapping("/hello")
    String sayHelloWorld(){
        return "<h1>Hello World!!</h1>";
    }
}
