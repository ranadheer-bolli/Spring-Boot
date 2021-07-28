package com.ranadheer.springboot.demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Contoller {

    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
