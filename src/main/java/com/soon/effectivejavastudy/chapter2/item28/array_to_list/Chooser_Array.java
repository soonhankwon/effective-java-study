package com.soon.effectivejavastudy.chapter2.item28.array_to_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// 배열 기반 Chooser
public class Chooser_Array<T> {

//    private final T[] choiceList;
    private final List<T> choiceList;

    public Chooser_Array(Collection<T> choices) {
        // unchecked warning
//        this.choiceList = (T[]) choices.toArray();
        choiceList = new ArrayList<>(choices);
    }

    public T choose() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);
//        List<String> strList = List.of("soon", "han");

        Chooser_Array<Integer> chooser = new Chooser_Array<>(intList);
//        Chooser_Array chooser = new Chooser_Array(strList); //ClassCastException

        for(int i = 0; i < 10; i++) {
            Number choice = chooser.choose();
            System.out.println(choice);
        }
    }
}
