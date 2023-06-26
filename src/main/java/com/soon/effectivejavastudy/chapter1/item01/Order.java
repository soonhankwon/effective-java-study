package com.soon.effectivejavastudy.chapter1.item01;

import java.util.*;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus orderStatus;

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

    public static void main(String[] args) {
        //Q1
        Arrays.stream(OrderStatus.values())
                .forEach(System.out::println);
        //Q2 equals 의 경우 NPE 가능성
        Order order = new Order();
        if(order.orderStatus == OrderStatus.DELIVERED) {
            System.out.println("delivered");
        }
        //Q3 EnumMap 훨씬 효율적
        EnumMap<OrderStatus, Integer> enumMap = new EnumMap<>(OrderStatus.class);
        enumMap.put(OrderStatus.SHIPPED, 1);
        enumMap.put(OrderStatus.DELIVERED, 1);
        enumMap.put(OrderStatus.SHIPPED, 1);
        Set<OrderStatus> keySet = enumMap.keySet();
        for (OrderStatus orderStatus : keySet) {
            System.out.println("key = " + orderStatus);
        }
    }
}
