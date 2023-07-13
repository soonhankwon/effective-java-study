package com.soon.effectivejavastudy.chapter1.item11.hashtable;

import com.soon.effectivejavastudy.chapter1.item11.hashcode.PhoneNumber;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        Map<PhoneNumber, String> map = new HashMap<>();
        PhoneNumber number1 = new PhoneNumber(123, 456, 7890);
        PhoneNumber number2 = new PhoneNumber(123, 456, 7890);
        PhoneNumber number3 = new PhoneNumber(123, 567, 7890);

        System.out.println(number1.equals(number2));
        // 같은 인스턴스인데 다른 hashcode
        System.out.println(number1.hashCode());
        System.out.println(number2.hashCode());

        map.put(number1, "soon");
        map.put(number2, "han");

//        String s = map.get(number2);
        // null -> hashcode 가 없다! (재정의를 안해준 상태)
        String s = map.get(new PhoneNumber(123, 456, 7890));
        System.out.println(s);
    }
}
