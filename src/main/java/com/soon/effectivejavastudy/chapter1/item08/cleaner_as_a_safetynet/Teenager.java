package com.soon.effectivejavastudy.chapter1.item08.cleaner_as_a_safetynet;

public class Teenager {

    public static void main(String[] args) {
        new Room(99);
        System.out.println("Peace Out");

        System.gc();
    }
}
