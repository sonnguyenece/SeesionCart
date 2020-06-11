package com.codegym.model;

public class CartProducts {
    private Long id;
    private int quantity;

    public CartProducts() {
    }

    public CartProducts(Long id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void increment(){
        this.quantity++;
    }
    public void decrement(){
        this.quantity--;
    }
}
