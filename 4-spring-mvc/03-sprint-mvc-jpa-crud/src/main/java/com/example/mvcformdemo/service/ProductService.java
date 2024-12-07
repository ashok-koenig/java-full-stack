package com.example.mvcformdemo.service;

import com.example.mvcformdemo.model.Product;
import com.example.mvcformdemo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;
    public  ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Integer id){
        return productRepository.findById(id).orElse(null);
    }

    public void saveProduct(Product product){
        productRepository.save(product);
    }

    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }
}
