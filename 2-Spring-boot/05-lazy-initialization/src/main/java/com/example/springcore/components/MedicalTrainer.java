package com.example.springcore.components;

import com.example.springcore.models.Trainer;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MedicalTrainer implements Trainer {
    private String subject = "Medical Science";
    MedicalTrainer(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getSubject() {
        return this.subject;
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
