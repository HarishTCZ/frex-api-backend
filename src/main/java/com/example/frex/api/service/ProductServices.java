package com.example.frex.api.service;

import com.example.frex.api.DAO.ProductRepository;
import com.example.frex.api.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;

    public ProductModel addProduct(ProductModel productModel) {
        return productRepository.save(productModel);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public List<ProductModel> findAllProduct() {
        List<ProductModel> productModels = productRepository.findAll();
        return productRepository.findAll();
    }

}
