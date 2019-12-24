package com.example.platform.service;

import com.example.platform.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();
    public List<Product> getAllProductOfProvider(long providerId);
    public Product getProductById(long productId);
    public Product getProductByName(String name);

    public void save(Product product);
    public void edit(Product product);
    public void delete(long id);

}
