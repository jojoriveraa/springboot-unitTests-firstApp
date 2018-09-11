package com.jrivera.firstdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingsController {

    private final ServiceGreeting serviceGreeting;

    public GreetingsController(ServiceGreeting serviceGreeting) {
        this.serviceGreeting = serviceGreeting;
    }

    @RequestMapping("/greeting")
    @ResponseBody
    public String greeting(){
        return serviceGreeting.greet();
    }
}
