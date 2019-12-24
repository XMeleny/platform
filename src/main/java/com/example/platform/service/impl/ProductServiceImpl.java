package com.example.platform.service.impl;

import com.example.platform.entity.Product;
import com.example.platform.repository.ProductRepository;
import com.example.platform.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getAllProductOfProvider(long providerId) {
        return productRepository.findByProviderId(providerId);
    }

    @Override
    public Product getProductById(long productId) {
        return productRepository.findById(productId);
    }

    @Override
    public Product getProductByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void edit(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(long id) {
        productRepository.deleteById(id);
    }
}
