package com.example.jparestdemo.controller;

import com.example.jparestdemo.entity.Employee;
import com.example.jparestdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        return employeeService.save(employee);
    }

    @PutMapping("/{empId}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable int empId){
        employee.setId(empId);
        return employeeService.save(employee);
    }
    @GetMapping("/{empId}")
    public Employee getEmployee(@PathVariable int empId){
        Employee employee = employeeService.findById(empId);
        if(employee == null){
            throw new RuntimeException("Employee id not found - "+ empId);
        }
        return  employee;
    }

    @DeleteMapping("/{empId}")
    public String deleteEmployee(@PathVariable int empId){
        Employee employee = employeeService.findById(empId);
        if(employee == null){
            throw new RuntimeException("Employee id not found - "+ empId);
        }
        employeeService.deleteById(empId);
        return  "Deleted employee id: "+ empId;
    }
}
