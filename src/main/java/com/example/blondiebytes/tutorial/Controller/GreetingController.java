package com.example.blondiebytes.tutorial.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/greeting")
    public String getGreeting(){
        return "Hi it's me Midou adn I like gaming";
    }
}
