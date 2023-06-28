package com.soon.effectivejavastudy.chapter1.item02;

import java.util.Arrays;

public class VarargsSamples {

    public void printNumbers(String name, int...numbers) {
        System.out.println(numbers.getClass().getCanonicalName());
        System.out.println(numbers.getClass().getComponentType());
        System.out.println(name);
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public static void main(String[] args) {
        VarargsSamples samples = new VarargsSamples();
        samples.printNumbers("STAR",5,10);
    }
}
