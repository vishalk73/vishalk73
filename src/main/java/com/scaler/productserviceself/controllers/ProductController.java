package com.scaler.productserviceself.controllers;

import com.scaler.productserviceself.Services.ProductService;
import com.scaler.productserviceself.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Products")
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService){
        this.productService=productService;
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable ("id") Long id){
        return productService.getSingleProduct(id);
    }

    public List<Product> getAllProducts(){
        return new ArrayList<>();
    }

}
