package com.example.jpadatarestdemo.repository;

import com.example.jpadatarestdemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
