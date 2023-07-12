package com.soon.effectivejavastudy.chapter1.item10;

import java.sql.Timestamp;
import java.util.Date;

public class EqualsInJava {

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(time);
        Date date = new Date(time);

        // 대칭성 위배
        System.out.println(timestamp.equals(date)); // false
        System.out.println(date.equals(timestamp)); // true
    }
}
