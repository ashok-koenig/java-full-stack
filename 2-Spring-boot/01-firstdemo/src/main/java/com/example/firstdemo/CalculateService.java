package com.example.firstdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public double calculate(double price, double quantity){
        return price * quantity;
    }
}
