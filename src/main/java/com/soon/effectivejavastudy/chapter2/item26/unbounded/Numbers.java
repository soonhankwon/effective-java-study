package com.soon.effectivejavastudy.chapter2.item26.unbounded;

import java.util.HashSet;
import java.util.Set;

public class Numbers {

    static int numElementsInCommon(Set<?> s1, Set<?> s2) {
//        s1.add("soon");
        int result = 0;
        for (Object o1 : s1) {
            if (s2.contains(o1)) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // 안정성
        Set<?> mySet = set;

        System.out.println(Numbers.numElementsInCommon(Set.of(1, 2, 3), Set.of(1, 2)));
    }
}
