package com.example.springcore.components;

import com.example.springcore.models.Trainer;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ComputerTrainer implements Trainer {
    private String subject = "Computer Science";

    ComputerTrainer(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }

    @PostConstruct
    public void initStuff(){
        System.out.println("In initStuff: " + getClass().getSimpleName());
    }

    @Override
    public String getSubject() {
        return this.subject;
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @PreDestroy
    public void cleanupStuff(){
        System.out.println("In cleanupStuff: "+ getClass().getSimpleName());
    }
}
