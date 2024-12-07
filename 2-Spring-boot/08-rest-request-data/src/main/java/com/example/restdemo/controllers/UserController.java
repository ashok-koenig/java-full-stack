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
    public String createUser(@RequestBody String body){
        return "User created successfully with body data: "+ body;
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id, @RequestBody String body){
        return "User updated successfully with id: " +id + " and data: "+ body;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
        return "User deleted successfully with id: "+id;
    }
}
