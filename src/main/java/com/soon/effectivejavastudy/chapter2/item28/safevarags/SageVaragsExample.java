package com.soon.effectivejavastudy.chapter2.item28.safevarags;

import java.util.List;

public class SageVaragsExample {

    //possible heap pollution
    static void notSafe(List<String> ... stringLists) {
        Object[] array = stringLists; // List<String>... -> List[], 배열은 공변
        List<Integer> tmpList = List.of(42);
        array[0] = tmpList; //Semantically invalid, but compiles without warning
        String s = stringLists[0].get(0); //ClassCastException at runtime
    }

    @SafeVarargs
    static <T> void safe(T... values) {
        for(T value : values) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        SageVaragsExample.safe("a", "b", "c");
        SageVaragsExample.notSafe(List.of("a", "b", "c"));
    }
}
