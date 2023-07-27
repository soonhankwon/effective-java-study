package com.soon.effectivejavastudy.chapter2.item19.impespec;

public class ExtendableClass {

    /**
     * This method can be overridden to print any message.
     * @implSpec
     * Please use System.out.println().
     */

    protected void doSomething() {
        System.out.println("hello");
    }
}
