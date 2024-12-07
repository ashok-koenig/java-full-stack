package com.example.jparestadvanced.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
@NamedQueries({
        @NamedQuery(name = "Product.findByCategory", query = "SELECT p FROM Product p WHERE p.category = :category"),
        @NamedQuery(name = "Product.updatePriceByCategory", query = "UPDATE Product p SET p.price = :price WHERE p.category = :category")
})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String title;
    private String category;
    private double price;

    @Version
    private int version;

    public Product() {}

    public Product(String title, String category, double price) {
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", version=" + version +
                '}';
    }
}
