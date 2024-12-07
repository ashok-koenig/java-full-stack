package com.example.jparestadvanced.repository;

import com.example.jparestadvanced.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // JPQL Query
    @Query("SELECT p FROM Product p ORDER BY p.price DESC")
    List<Product> findAllProductsSortedByPrice();

    @Query("SELECT p FROM Product p WHERE p.price BETWEEN :minPrice AND :maxPrice")
    List<Product> findByPriceRange(@Param("minPrice") double minPrice, @Param("maxPrice") double maxPrice);

    // Advancded JPA Features

    @Query(name= "Product.findByCategory")
    List<Product> findByCategory(@Param("category") String category);

    // Bulk updates
    @Modifying
    @Transactional
    @Query(name = "Product.updatePriceByCategory")
    int updatePriceByCategory(@Param("price") double price, @Param("category") String category);

    @Modifying
    @Transactional
    @Query("DELETE FROM Product p WHERE p.price < :price")
    int deleteByPriceLessThan(@Param("price") double price);

    // Native SQL Query
    @Query(value = "SELECT * FROM products WHERE LOWER(title) LIKE LOWER(CONCAT('%', :title, '%'))", nativeQuery = true)
    List<Product> searchByTitle(@Param("title") String title);

}
