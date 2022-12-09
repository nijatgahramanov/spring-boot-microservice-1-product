package com.ng.springbootmicroservice1product.repository;

import com.ng.springbootmicroservice1product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
