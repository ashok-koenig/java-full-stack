package com.example.springcore.components;

import com.example.springcore.models.Trainer;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ComputerTrainer implements Trainer {
    private String subject;
    @Override
    public String getSubject() {
        return this.subject;
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
