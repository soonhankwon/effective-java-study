package com.soon.effectivejavastudy.chapter1.item06;

import java.util.regex.Pattern;

public class RegularExpression {

    private static final Pattern SPLIT_PATTERN = Pattern.compile(",");

    public static void main(String[] args) {
        long start = System.nanoTime();
        for(int i = 0; i < 10000; i++) {
            String name ="soon,soonable";
            name.split(",");
//            SPLIT_PATTERN.split(name);
            name.replaceAll(",", "");
//            SPLIT_PATTERN.matcher(name).replaceAll("");
        }
        // 237927325
        // 48313913

        System.out.println(System.nanoTime() - start);
    }
}
