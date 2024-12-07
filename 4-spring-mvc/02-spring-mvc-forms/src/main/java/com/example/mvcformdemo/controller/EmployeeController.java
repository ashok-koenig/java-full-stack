package com.example.mvcformdemo.controller;

import com.example.mvcformdemo.model.Address;
import com.example.mvcformdemo.model.Employee;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EmployeeController {

    @GetMapping("/employee/register")
    public String showForm(Model model){

        Employee employee = new Employee();
        employee.setAddress(new Address());
        model.addAttribute("employee", employee);
        String[] departments = {"IT", "Admin", "HR"};
        model.addAttribute("departments", departments);
        return "employee-form";
    }

    @PostMapping("/employee/save")
    public String saveEmployee(@Valid @ModelAttribute Employee employee, BindingResult result, Model model){

        if(result.hasErrors()){
            String[] departments = {"IT", "Admin", "HR"};
            model.addAttribute("departments", departments);
            return "employee-form";
        }
        model.addAttribute("employee", employee);
        return "employee-success";
    }
}
