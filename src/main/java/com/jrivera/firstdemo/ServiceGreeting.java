package com.jrivera.firstdemo;

import org.springframework.stereotype.Service;

@Service
public class ServiceGreeting {
    public String greet(){
        return "Greetings for you";
    }
}
