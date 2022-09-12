package com.satish.SpringBootSample.controller;

import com.satish.SpringBootSample.model.User;
import com.satish.SpringBootSample.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/** Request flow -- Controller -> Service -> DAO -> Database */
//@Controller
@RestController //@Controller + @ResponseBody
public class HelloWorldController {

    @Autowired
    UserService userService;

    @GetMapping("/greetMe")
    public String greet() {
        return "Hello World";
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        User user1 = new User(1, "Sat");
        User user2 = new User(1, "San");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        return list;
    }

    /*@PostMapping("/saveUser")
    public User saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }*/
}
