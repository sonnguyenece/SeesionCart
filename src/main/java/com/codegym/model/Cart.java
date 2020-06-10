package com.codegym.model;

public class Cart {
    private String id;
    private int quantity;

    public Cart(String id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public Cart() {
   }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
