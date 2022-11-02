package com.example.onlineshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.onlineshop.entity.CategoryEntity;
import com.example.onlineshop.entity.ProductEntity;
import com.example.onlineshop.repository.CategoryRepository;
import com.example.onlineshop.repository.ProductRepository;

@Controller
public class ProductController {
    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping(name = "/")
    public ResponseEntity<List<ProductEntity>> getAllProducts(){
        List<ProductEntity> products = new ArrayList<>();

        ProductEntity product = new ProductEntity();
        product.setProductName("Bluza");
        products.add(product);

        CategoryEntity category = new CategoryEntity();
        category.setCategory("Drehi");
        category.setProducts(products);

        categoryRepository.save(category);
        

        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
