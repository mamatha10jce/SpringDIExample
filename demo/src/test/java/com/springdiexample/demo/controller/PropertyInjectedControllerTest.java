package com.springdiexample.demo.controller;

import com.springdiexample.demo.services.GreetingService;
import com.springdiexample.demo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setup(){
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();
    }
    @Test
    public void getGreeting(){
        System.out.println(controller.getGreeting());

    }
}