package com.Harry6081.SpringFunctionsTraning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String helloWorld(){
        return "Welcome to DailyCode Buffer!! Harsha  harry  ! @@@@";
    }

}
