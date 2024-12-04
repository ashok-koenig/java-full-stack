package com.example.springcore.controllers;

import com.example.springcore.components.ComputerTrainer;
import com.example.springcore.models.Trainer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    Trainer trainer;
    Trainer anotherTrainer;
    // Singleton: A single instance for the bean per spring IoC Container - Default bean scope.
    // prototype: A new instance of the bean is created each time it is injected.

    DemoController(Trainer trainer, Trainer anotherTrainer){
        this.trainer = trainer;
        this.anotherTrainer = anotherTrainer;

        this.trainer.setSubject("HTML Trainer");
        this.anotherTrainer.setSubject("Angular Trainer");
    }
    @GetMapping("/subject")
    public String subject(){
        return "trainer:"+ trainer.getSubject() + "Another Trainer: "+ anotherTrainer.getSubject();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing Beans: trainer == anotherTrainer: " + (trainer == anotherTrainer);
    }
}
