package com.example.frex.api.controller;

import com.example.frex.api.model.ProductModel;
import com.example.frex.api.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
