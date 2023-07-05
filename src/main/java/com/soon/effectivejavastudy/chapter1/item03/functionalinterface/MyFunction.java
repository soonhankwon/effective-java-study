package com.soon.effectivejavastudy.chapter1.item03.functionalinterface;

@FunctionalInterface
public interface MyFunction {

    String valuOf(Integer integer);

    static String hello() {
        return "hello";
    }
}
