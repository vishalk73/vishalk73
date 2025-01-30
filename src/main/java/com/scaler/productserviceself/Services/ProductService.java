package com.scaler.productserviceself.Services;

import com.scaler.productserviceself.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long productId);
    List<Product> getAllProducts();
}
