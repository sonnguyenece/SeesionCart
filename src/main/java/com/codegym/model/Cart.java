package com.codegym.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Long, Integer> productList;

    public Cart() {
        this.productList = new HashMap<>();
    }

    public void addAProduct(Long id) {
        int quantity = 1;
        if (productList.containsKey(id)) {
            quantity = productList.get(id);
            productList.replace(id, quantity + 1);
        } else productList.put(id, quantity);
    }

    public void removeAProduct(Long id) {
        int quantity = 0;
        if (productList.containsKey(id)) {
            quantity = productList.get(id);
            productList.replace(id, quantity - 1);
        }
        if (quantity == 0) productList.clear();
    }

    public void removeAllProduct(Long id) {
        productList.clear();
    }

    public Map<Long, Integer> getProductList() {
        return productList;
    }

    public void setProductList(Map<Long, Integer> productList) {
        this.productList = productList;
    }
}
