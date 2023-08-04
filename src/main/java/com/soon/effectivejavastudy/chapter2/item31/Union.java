package com.soon.effectivejavastudy.chapter2.item31;

import java.util.HashSet;
import java.util.Set;

// 제네릭 union 메서드에 와일드카드 타입을 적용해 유연성을 높였다.
public class Union {

    public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> result = new HashSet<>();
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(3);
        integers.add(5);

        Set<Double> doubles = new HashSet<>();
        doubles.add(2.0);
        doubles.add(4.0);
        doubles.add(6.0);

        Set<Number> numbers = union(integers, doubles);

        System.out.println(numbers);
     }
}
