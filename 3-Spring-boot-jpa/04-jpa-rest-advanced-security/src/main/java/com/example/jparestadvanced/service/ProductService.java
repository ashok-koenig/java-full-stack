package com.example.jparestadvanced.service;

import com.example.jparestadvanced.entity.Product;
import com.example.jparestadvanced.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @Transactional
    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    @Transactional
    public Product updateProduct(Product product){
        return productRepository.save(product);
    }

    @Transactional
    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }

    // JPQL Service

    public List<Product> findAllProductsSortedByPrice(){
        return  productRepository.findAllProductsSortedByPrice();
    }

    public List<Product> getProductsByPriceRange(double minPrice, double maxPrice){
        return productRepository.findByPriceRange(minPrice, maxPrice);
    }

    public List<Product> getProductByCategory(String category){
        return productRepository.findByCategory(category);
    }

    public int updatePriceByCategory(double price, String category){
        return productRepository.updatePriceByCategory(price, category);
    }

    public int deleteByPriceLessThan(double price){
        return productRepository.deleteByPriceLessThan(price);
    }

    public List<Product> searchProductByTitle(String title){
        return productRepository.searchByTitle(title);
    }
}
