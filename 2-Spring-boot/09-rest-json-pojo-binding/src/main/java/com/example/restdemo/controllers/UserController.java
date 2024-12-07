package com.example.restdemo.controllers;

import com.example.restdemo.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User(1, "John", 25));
        users.add(new User(2, "Smith", 26));
        return users;
    }

    @PostMapping
    public String createUser(@RequestBody User user){
        return "User created successfully with body data: "+ user;
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
