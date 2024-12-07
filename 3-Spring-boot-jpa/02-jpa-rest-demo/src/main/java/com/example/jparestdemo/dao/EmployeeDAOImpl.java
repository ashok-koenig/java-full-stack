package com.example.jparestdemo.dao;

import com.example.jparestdemo.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    private EntityManager entityManager;

    @Autowired
    EmployeeDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        return entityManager.createQuery("FROM Employee", Employee.class).getResultList();
    }

    @Override
    public Employee findById(Integer id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);
    }
}
