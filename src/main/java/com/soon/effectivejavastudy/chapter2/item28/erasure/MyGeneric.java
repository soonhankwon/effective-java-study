package com.soon.effectivejavastudy.chapter2.item28.erasure;

import java.util.ArrayList;
import java.util.List;

public class MyGeneric {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("soon");
        String name = names.get(0);
        System.out.println(name);

        List names1 = new ArrayList();
        names1.add("soon");
        Object o = names1.get(0);
        String name1 = (String) o;
        System.out.println(name1);
    }
}
