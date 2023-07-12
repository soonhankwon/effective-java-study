package com.soon.effectivejavastudy.chapter1.item10;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;

public class EqualsInJava {

    public static void main(String[] args) throws MalformedURLException {
        long time = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(time);
        Date date = new Date(time);

        // 대칭성 위배
        System.out.println(timestamp.equals(date)); // false
        System.out.println(date.equals(timestamp)); // true

        // 일관성을 위반할 수 있는 경우 (복잡한 경우 -> ip를 비교한다.)
        URL google1 = new URL("https", "about.google", "/product/");
        URL google2 = new URL("https", "about.google", "/product/");
        System.out.println(google1.equals(google2));
    }
}
