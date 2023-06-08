package com.soon.effectivejavastudy.chapter1.item01;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

//    public Order(Product product, boolean prime) {
//        this.product = product;
//        this.prime = prime;
//    }
//
//    public Order(boolean urgent, Product product) {
//        this.product = product;
//        this.prime = urgent;
//    }

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        return order;
    }
}
