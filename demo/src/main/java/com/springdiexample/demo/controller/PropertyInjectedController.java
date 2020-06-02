package com.springdiexample.demo.controller;

import com.springdiexample.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedService")
    @Autowired
    public  GreetingService greetingService;


    public String getGreeting(){
        return greetingService.sayHello();
    }
}
