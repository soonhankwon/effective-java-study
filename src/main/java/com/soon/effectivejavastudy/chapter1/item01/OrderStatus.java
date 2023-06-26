package com.soon.effectivejavastudy.chapter1.item01;

public enum OrderStatus {
    PREPARING(0L), SHIPPED(1L), DELIVERING(2L), DELIVERED(3L);

    private Long statusCode;

    OrderStatus(Long statusCode) {
        this.statusCode = statusCode;
    }
}
