package com.ranadheer.springboot.Applicationdemo.rest;

import com.ranadheer.springboot.Applicationdemo.entity.User;
import com.ranadheer.springboot.Applicationdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class UserRestController {

    // Field Injection
    @Autowired
    private UserService userService;


    @GetMapping("/hello")
    public String hello(){
        return "Hello Wolrd";
    }

    @PostMapping("/user")
    public void createUser(HttpServletRequest httpServletRequest, @RequestBody User user){
        userService.createUser(user);
    }
    @PutMapping("/user")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }
    @GetMapping("/user/{userId}")
    public User display(@PathVariable int userId){
       User user = userService.getUser(userId);
       return user;
    }
    @DeleteMapping("/user/{userId}")
    public void deleteUser(@PathVariable int userId){
        userService.deleteUser(userId);
    }


}
