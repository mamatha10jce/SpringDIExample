package com.springdiexample.demo.controller;

import com.springdiexample.demo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {
    private final GreetingService greetingService;

    public PrimaryController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
