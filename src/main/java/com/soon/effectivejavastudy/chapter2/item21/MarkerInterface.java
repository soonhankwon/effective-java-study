package com.soon.effectivejavastudy.chapter2.item21;

public interface MarkerInterface {

    default void hello() {
        System.out.println("interface hello");
    }
}
