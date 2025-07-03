package com.example.frex.api.controller;

import com.example.frex.api.model.ProductModel;
import com.example.frex.api.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @PostMapping("/addproduct")
    public ResponseEntity<ProductModel> addProduct(@RequestBody ProductModel productModel) {
        ProductModel savedProduct = productServices.addProduct(productModel);
        return ResponseEntity.ok(savedProduct);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        productServices.deleteProduct(id);
        return ResponseEntity.ok("Product deleted successfully.");
    }

    @GetMapping("/findAll")
    public List<ProductModel> findAll() {
        return productServices.findAllProduct();
    }



}
