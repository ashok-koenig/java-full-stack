package com.example.springcore.controllers;

import com.example.springcore.components.ComputerTrainer;
import com.example.springcore.components.MedicalTrainer;
import com.example.springcore.models.Trainer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    Trainer trainer;

       DemoController(@Qualifier("computerTrainer") Trainer trainer){
        this.trainer = trainer;
    }

    @GetMapping("/subject")
    public String subject(){
        return "trainer:"+ trainer.getSubject();
    }


}
