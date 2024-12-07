package com.example.jpaentitydemo.dao;

import com.example.jpaentitydemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student newStudent) {
        entityManager.persist(newStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("FROM Student", Student.class).getResultList();
    }

    @Override
    @Transactional
    public void update(Student updatedStudent) {
        entityManager.merge(updatedStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student tempStudent = entityManager.find(Student.class, id);
        entityManager.remove(tempStudent);
    }
}
