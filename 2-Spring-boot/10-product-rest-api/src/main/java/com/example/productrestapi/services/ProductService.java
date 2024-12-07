package com.example.productrestapi.services;

import com.example.productrestapi.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();
    public ProductService(){
        products.add(new Product(1, "Dell Laptop", "Laptop", 90888));
        products.add(new Product(2, "HP Laptop", "Laptop", 78787));
        products.add(new Product(3, "iPhone 16", "Smartphone", 57778));
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public boolean updateProduct(int id, Product updatedProduct){
        for(Product product: products){
            if(product.getId() == id){
                product.setTitle(updatedProduct.getTitle());
                product.setCategory(updatedProduct.getCategory());
                product.setPrice(updatedProduct.getPrice());
                return true;
            }
        }
        return false;
    }

    public boolean deleteProduct(int id){
        return products.removeIf(product -> product.getId() == id);
    }
}
