package com.ranadheer.springboot.Applicationdemo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

    @RequestMapping("/register")
    public String register(){
        return "register";
    }
}