package com.ranadheer.springboot.springbootappdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {
    @GetMapping("/showLoginPage")
    public String login(){
        return "login";
    }
}
