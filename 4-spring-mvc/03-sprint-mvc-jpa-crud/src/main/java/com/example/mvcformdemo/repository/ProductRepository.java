package com.example.mvcformdemo.repository;

import com.example.mvcformdemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
