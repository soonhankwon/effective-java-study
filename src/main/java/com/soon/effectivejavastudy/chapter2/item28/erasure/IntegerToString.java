package com.soon.effectivejavastudy.chapter2.item28.erasure;

import java.util.ArrayList;
import java.util.List;

public class IntegerToString {

    public static void main(String[] args) {
        // 공변
        Object[] anything = new String[10];
//        anything[0] = 1; // ArrayStoreException

        // 불공변
        List<String> names = new ArrayList<>();
//        List<Object> objects = names;
    }
}
