package com.soon.effectivejavastudy.chapter2.item21.failfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

    public static void main(String[] args) {
        // Immutable Collection
//        List<Integer> numbers = List.of(1,2,3,4,5);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // ConcurrentModificationException
//        for (Integer number : numbers) {
//            if(number == 3)
//                numbers.remove(number);
//        }

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            if (number == 3)
                numbers.remove(number);
        }

        // index
        for(int i = 0; i < numbers.size() ; i++) {
            if(numbers.get(i) == 3)
                numbers.remove(numbers.get(i));
        }

        // removeIf
        numbers.removeIf(number -> number == 3);
    }
}
