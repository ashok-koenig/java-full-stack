package com.example.jparestdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "emp_name")
    private String empName;

    @Column(name="emp_email")
    private String empEmail;

    @Column(name = "emp_salary")
    private double empSalary;

    Employee(){

    }

    public Employee(String empName, String empEmail, double empSalary) {
        this.empName = empName;
        this.empEmail = empEmail;
        this.empSalary = empSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
