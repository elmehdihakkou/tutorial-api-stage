package com.example.blondiebytes.tutorial.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/greeting")
    public int getGreeting(@RequestParam(value = "investment_status", defaultValue = " ") boolean investment_status){
        if (investment_status){
            return 1;
        } else{
            return 0;
        }
    }
}
