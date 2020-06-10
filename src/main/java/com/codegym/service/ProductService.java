package com.codegym.service;

import com.codegym.model.Product;

public interface ProductService {
    Iterable<Product>findAll();

    void save(Product product);

    void remove(Long id);

    Product findById(Long id);

}
