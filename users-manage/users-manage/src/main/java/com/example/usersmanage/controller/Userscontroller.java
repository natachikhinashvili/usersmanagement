package com.example.usersmanage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.usersmanage.User;
import com.example.usersmanage.service.UserService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class Userscontroller {
    
    @Autowired
    UserService userservice;


    @GetMapping("/users")
    public List<User> getusers() {
        return userservice.getAllUsers();
    }
    
    @GetMapping("/category/{category}")
    public List<User> getUserByLanguage(@PathVariable String language){
        return userservice.getUserByLanguage(language);
    }

    @PostMapping("add")
    public String addUser(@RequestBody User user){
        return userservice.addUser(user);
    }
}
