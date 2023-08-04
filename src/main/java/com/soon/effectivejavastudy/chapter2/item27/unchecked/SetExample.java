package com.soon.effectivejavastudy.chapter2.item27.unchecked;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        // unchecked warning
        Set names = new HashSet();

        Set<String> strings  = new HashSet<>();
    }
}
