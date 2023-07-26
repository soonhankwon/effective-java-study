package com.soon.effectivejavastudy.chapter2.item17.memorymodel;

public class Soon {

    private final int x;
    private final int y;

    public Soon() {
        this.x = 1;
        this.y = 2;
    }

    public static void main(String[] args) {
        // Object s = new Soon();
        // s.x = 1
        // s.y = 2
        // soon = s

        Soon soon = new Soon();
    }
}
