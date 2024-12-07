package com.example.mvcformdemo.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Employee {
    @NotEmpty(message = "Name is required")
    private String name;

    @NotEmpty(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;

    @NotEmpty(message = "Department is required")
    private String department;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date joiningDate;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }
}
