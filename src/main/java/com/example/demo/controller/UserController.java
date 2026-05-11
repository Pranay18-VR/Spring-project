package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser() {

        return new User(1, "Pranaya");
    }
}
