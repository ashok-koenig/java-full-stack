package com.example.jpaentitydemo.dao;

import com.example.jpaentitydemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student newStudent);

    Student findById(Integer id);

    List<Student> findAll();

    void update(Student updatedStudent);

    void delete(Integer id);
}