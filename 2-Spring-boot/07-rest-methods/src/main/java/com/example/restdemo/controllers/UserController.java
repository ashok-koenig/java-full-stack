package com.example.restdemo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getAllUsers(){
        return "List of Users";
    }

    @PostMapping
    public String createUser(){
        return "User created successfully";
    }

    @PutMapping
    public String updateUser(){
        return "User updated successfully";
    }

    @DeleteMapping
    public String deleteUser(){
        return "User deleted successfully";
    }
}
