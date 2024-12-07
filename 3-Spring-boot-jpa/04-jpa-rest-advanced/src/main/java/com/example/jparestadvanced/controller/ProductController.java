package com.example.jparestadvanced.controller;

import com.example.jparestadvanced.entity.Product;
import com.example.jparestadvanced.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private ProductService productService;

    @Autowired
   public ProductController(ProductService productService){
       this.productService = productService;
   }

   @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
   }

   @GetMapping("/sorted")
   public List<Product> findAllProductsSortedByPrice(){
        return productService.findAllProductsSortedByPrice();
   }

   @GetMapping("/price-range")
   public List<Product> getProductsByPriceRange(@RequestParam double minPrice, @RequestParam double maxPrice){
        return productService.getProductsByPriceRange(minPrice, maxPrice);
   }

   @GetMapping("/category")
   public List<Product> getProductsByCategory(@RequestParam String category){
        return productService.getProductByCategory(category);
   }

   @PostMapping
   public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
   }

   @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product product){
        product.setId(id);
        return productService.updateProduct(product);
   }

   @DeleteMapping("/{id}")
   public void deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
   }

   @PutMapping("/update-price")
    public String updatePriceByCategory(@RequestParam double price, @RequestParam String category){
        int updatedCount = productService.updatePriceByCategory(price, category);
        return updatedCount + " products price updated successfully";
   }

   @DeleteMapping("/delete-by-price")
    public String deleteByPriceLessThan(@RequestParam double price){
        int deletedCount = productService.deleteByPriceLessThan(price);
        return deletedCount + " Products deleted successfully";
   }

   @GetMapping("/search")
    public List<Product> searchProductsByTitle(@RequestParam String title){
        return productService.searchProductByTitle(title);
   }
}
