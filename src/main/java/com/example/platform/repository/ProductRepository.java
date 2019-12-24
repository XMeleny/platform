package com.example.platform.repository;

import com.example.platform.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findById(long id);
    Product findByName(String name);
    List<Product> findByProviderId(long providerId);
    void deleteById(long id);
}
