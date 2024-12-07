package com.example.productrestapi.controllers;

import com.example.productrestapi.models.Product;
import com.example.productrestapi.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    public  ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable int id, @RequestBody Product updatedProduct){
        boolean isUpdated = productService.updateProduct(id, updatedProduct);
        if(isUpdated){
            return ResponseEntity.ok("Product updated successfully");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id){
        boolean isDeleted = productService.deleteProduct(id);
        if(isDeleted){
            return ResponseEntity.ok("Product deleted successfully");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
        }
    }
}
