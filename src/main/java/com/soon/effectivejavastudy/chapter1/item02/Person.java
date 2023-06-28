package com.soon.effectivejavastudy.chapter1.item02;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private final String name;
    private final int birthYear;
    private final List<String> kids;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.kids = new ArrayList<>();
    }

//    public void setName(String name) {
//        checkIfObjectIsFrozen();
//        this.name = name;
//    }


    private void checkIfObjectIsFrozen() {
        if(this.frozen()) {
            throw new IllegalStateException();
        }
    }

    private boolean frozen() {
        return true;
    }

    public static void main(String[] args) {
        Person soon = new Person("SOON", 1988);
        soon.kids.add("SOONKYU"); // 레퍼런스(참조 자료형) 타입 바뀔수 있다.
    }
}
