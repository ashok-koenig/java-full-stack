package com.example.springcore.components;

import com.example.springcore.models.Trainer;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ComputerTrainer implements Trainer {
    private String subject = "Computer Science";
    @Override
    public String getSubject() {
        return this.subject;
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
