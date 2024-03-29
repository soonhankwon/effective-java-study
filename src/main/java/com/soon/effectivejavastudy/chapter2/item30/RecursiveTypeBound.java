package com.soon.effectivejavastudy.chapter2.item30;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

// 재귀적 타입 한정을 이용해 상호 비교할 수 있음을 표현
public class RecursiveTypeBound {

    // 재귀적 타입 한정
    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if(c.isEmpty())
            throw new IllegalArgumentException("collection is empty");

        E result = null;
        for(E e : c) {
            if(result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> argList = Arrays.asList("a", "b");
        System.out.println(max(argList));
    }
}
