package com.example.usersmanage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.usersmanage.User;
import com.example.usersmanage.service.UserService;


@RestController
public class Users {
    
    @Autowired
    UserService userservice;


    @GetMapping("/")
    public List<User> getusers() {
        return userservice.getAllUsers();
    }
    
    @GetMapping("/category/{category}")
    public List<User> getUserByCategory(@PathVariable String category){
        return userservice.getUserByCategory(category);
    }

    @PostMapping("add")
    public String addUser(@RequestBody User user){
        return userservice.addUser(user);
    }
}
