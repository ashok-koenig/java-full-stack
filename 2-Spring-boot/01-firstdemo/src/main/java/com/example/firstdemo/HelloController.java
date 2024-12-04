package com.example.firstdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    CalculateService calcService;

    // Constructor injection
//    HelloController(CalculateService calcService){
//        this.calcService = calcService;
//    }

    //Setting injection
    @Autowired
    public void setCalcService(CalculateService calcService){
        this.calcService = calcService;
    }

    @Value("${my.message}")
    private String myMessage;

    @GetMapping("/")
    public String sayHello(){
        return "Hello, Welcome to Spring Boot Application";
    }

    @GetMapping("/about")
    public String aboutMe(){
        return "Hi, this is John Smith, My Message is: "+ myMessage;
    }

    @GetMapping("/total")
    private String totalPrice(){
        return "Total Price is: "+ calcService.calculate(150,20);
    }
}
