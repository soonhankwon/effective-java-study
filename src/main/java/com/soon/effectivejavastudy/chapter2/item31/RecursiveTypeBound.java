package com.soon.effectivejavastudy.chapter2.item31;

import com.soon.effectivejavastudy.chapter2.item31.example.IntegerBox;

import java.util.ArrayList;
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
        List<IntegerBox> list = new ArrayList<>();
        list.add(new IntegerBox(1, "a"));
        list.add(new IntegerBox(2, "b"));

        System.out.println(max(list));
    }
}
