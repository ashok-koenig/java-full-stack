package com.example.mvcdemo.controller;

import com.example.mvcdemo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/")
    public String showHome(Model model){
        return "home";
    }

    @RequestMapping("/about")
    public String showAbout(Model model){
        model.addAttribute("first_name", "John");
        model.addAttribute("last_name", "Peter");
        model.addAttribute("age", 15);
        String[] friends = {"Smith", "Ana", "July", "Bob"};
        model.addAttribute("friends", friends);

        Person smith = new Person("Smith", "smith@email.com", 34543);

        model.addAttribute("person", smith);

        Person[] employees = {
                new Person("John", "john@email.com", 345345),
                new Person("Smith", "smith@email.com", 345345),
                new Person("Bob", "bob@email.com", 345345),
                new Person("Ana", "ana@email.com", 345345)
        };
        model.addAttribute("employees", employees);
        return "about";
    }
}
