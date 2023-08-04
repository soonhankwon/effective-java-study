package com.soon.effectivejavastudy.chapter2.item31;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// 와일드카드 타입을 사용해 재귀적 타입 한정을 다음었다.
public class RecursiveTypeBound {

    public static <E extends Comparable<? super E>> E max(List<? extends E> list) {
        if(list.isEmpty())
            throw new IllegalArgumentException("list is empty");

        E result = null;
        for(E e : list) {
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
