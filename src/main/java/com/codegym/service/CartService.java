package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface CartService {
    List<Product> showAllCart();
    void addProductQuantity(Long id);
    void removeQuantity(Long id);
    void removeAllQuantity(Long id);
}
