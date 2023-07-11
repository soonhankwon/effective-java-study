package com.soon.effectivejavastudy.chapter1.item08.cleaner_as_a_safetynet;

public class Adult {

    public static void main(String[] args) throws Exception {
        try (Room myRoom = new Room(99)){
            System.out.println("hello!");
        }
    }
}
