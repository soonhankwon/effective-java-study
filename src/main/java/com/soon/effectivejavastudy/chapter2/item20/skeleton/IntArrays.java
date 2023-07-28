package com.soon.effectivejavastudy.chapter2.item20.skeleton;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

// 골격 구현을 사용해 완성한 구체 클래스
public class IntArrays {

    static List<Integer> intArraysAsList(int[] a) {
        Objects.requireNonNull(a);

        return new AbstractList<Integer>() {
            @Override
            public Integer get(int i) {
                return a[i]; //오토박싱
            }

            @Override
            public Integer set(int i, Integer val) {
                int oldVal = a[i];
                a[i] = val; // 오토언박싱
                return oldVal; //오토박싱
            }

            @Override
            public int size() {
                return a.length;
            }
        };
    }
}
