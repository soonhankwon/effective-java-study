package com.soon.effectivejavastudy.chapter1.item04;

public class UtilityClass {

    /**
     * this class can't create instance
     */
    private UtilityClass() {
        throw new AssertionError();
    }

    public static String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        String hello = UtilityClass.hello();

        UtilityClass utilityClass = new UtilityClass();
    }
}