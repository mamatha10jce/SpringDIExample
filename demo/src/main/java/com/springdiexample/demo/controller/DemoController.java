package com.springdiexample.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

    public String sayHello() {
        System.out.println("Hello mamatha");
        return "Hello dear";
    }
}
