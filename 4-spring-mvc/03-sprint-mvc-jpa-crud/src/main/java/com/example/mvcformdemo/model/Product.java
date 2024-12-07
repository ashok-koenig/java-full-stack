package com.example.mvcformdemo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @NotEmpty(message = "Title is required")
    private String title;

    @NotEmpty(message = "Category is required")
    private String category;

    @Positive(message = "Price must be positive")
    private double price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotEmpty(message = "Title is required") String getTitle() {
        return title;
    }

    public void setTitle(@NotEmpty(message = "Title is required") String title) {
        this.title = title;
    }

    public @NotEmpty(message = "Category is required") String getCategory() {
        return category;
    }

    public void setCategory(@NotEmpty(message = "Category is required") String category) {
        this.category = category;
    }

    @Positive(message = "Price must be positive")
    public double getPrice() {
        return price;
    }

    public void setPrice(@Positive(message = "Price must be positive") double price) {
        this.price = price;
    }
}
