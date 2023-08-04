package com.soon.effectivejavastudy.chapter2.item26.terms;

import java.util.ArrayList;
import java.util.List;

public class GenericBasic {

    public static void main(String[] args) {
        // Before use Generic (raw type)
        List numbers = new ArrayList();
        numbers.add(10);
        numbers.add("soon");

        for (Object number : numbers) {
            System.out.println((Integer) number);
        }

        // After use Generic
        List<Integer> nums = new ArrayList<>();
        nums.add(19);
        // compile error
//        nums.add("soon");

        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}
