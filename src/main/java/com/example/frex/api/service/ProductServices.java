package com.example.frex.api.service;

import com.example.frex.api.DAO.ProductRepository;
import com.example.frex.api.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;

    public ProductModel addProduct(ProductModel productModel) {
        return productRepository.save(productModel);
    }

}
