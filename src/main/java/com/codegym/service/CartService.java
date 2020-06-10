package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface CartService {
    List<Product> showAllCart();
    void addQuantity(Long id);
    void subtractQuantity(Long id);
    void subtractAllQuantity(Long id);
}
