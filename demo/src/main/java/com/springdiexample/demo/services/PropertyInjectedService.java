package com.springdiexample.demo.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedService implements GreetingService {
    @Override
    public String sayHello() {
        return "Constructor - Service";
    }
}
