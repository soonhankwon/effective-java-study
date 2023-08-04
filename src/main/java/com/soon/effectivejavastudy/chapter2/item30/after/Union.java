package com.soon.effectivejavastudy.chapter2.item30.after;

import java.util.HashSet;
import java.util.Set;

public class Union {

    // Generic Method
    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    // 제네릭 메서드를 활용한 간단한 프로그램
    public static void main(String[] args) {
        Set<String> guys = Set.of("Tom", "Harry", "Soon");
        Set<String> stooges = Set.of("Tom", "Harry", "Soon");
//        Set<Integer> stooges = Set.of(1,2,3);
        Set<String> all = union(guys, stooges);

        for (String o : all) {
            System.out.println(o);
        }
    }
}
