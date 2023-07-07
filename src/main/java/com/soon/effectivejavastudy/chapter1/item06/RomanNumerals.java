package com.soon.effectivejavastudy.chapter1.item06;

import java.util.regex.Pattern;

public class RomanNumerals {

    static boolean isRomanNumeralSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    // 값 비싼 객체를 재사용해 성능을 개선한다.
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeralFast(String s) {
        return ROMAN.matcher(s).matches();
    }

    public static void main(String[] args) {
        boolean result = false;
        long start = System.nanoTime();
        for(int j = 0; j < 100; j++) {
            result = isRomanNumeralSlow("MCMLXXVI");
        }
        long end = System.nanoTime();
        System.out.println(end - start);

        boolean result2 = false;
        long start2 = System.nanoTime();
        for(int j = 0; j < 100; j++) {
            result = isRomanNumeralSlow("MCMLXXVI");
        }
        long end2 = System.nanoTime();
        System.out.println(end2 - start2);
    }
}
