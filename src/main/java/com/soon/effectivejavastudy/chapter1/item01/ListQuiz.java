package com.soon.effectivejavastudy.chapter1.item01;

import java.util.ArrayList;
import java.util.Comparator;

public class ListQuiz {

    public static void main(String[] args) {
        //Q1
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(1);
        numbers.add(100);

        // 1, 4, 5, 100
        Comparator<Integer> desc = (o1, o2) -> o2 - o1;

        numbers.sort(desc);
        System.out.println(numbers);

        //Q2
        Comparator<Integer> asc = desc.reversed();
        numbers.sort(asc);
        System.out.println(numbers);
    }
}
