package com.ng.springbootmicroservice1product.service;

import com.ng.springbootmicroservice1product.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();
}
