package com.ranadheer.springboot.Applicationdemo.rest;

import com.ranadheer.springboot.Applicationdemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("login")
    public String login(){
        return "login-form";
    }

    @GetMapping("/register")
    public String register(@ModelAttribute User user){
        System.out.println(user.getUserName());
        return "registration-form";
    }
}
