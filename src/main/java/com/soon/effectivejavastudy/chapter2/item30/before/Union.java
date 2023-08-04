package com.soon.effectivejavastudy.chapter2.item30.before;

import java.util.HashSet;
import java.util.Set;

public class Union {

    // Generic Method
    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    // 제네릭 메서드를 활용한 간단한 프로그램
    public static void main(String[] args) {
        Set guys = Set.of("Tom", "Harry", "Soon");
        Set stooges = Set.of(1,2,3);
        Set all = union(guys, stooges);

        for (Object o : all) {
            //ClassCastException
            System.out.println((String) o);
        }
    }
}
