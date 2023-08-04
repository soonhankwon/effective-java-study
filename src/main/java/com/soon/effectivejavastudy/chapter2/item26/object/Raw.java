package com.soon.effectivejavastudy.chapter2.item26.object;

import java.util.ArrayList;
import java.util.List;

// runtime error - unsafeAdd 메서드가 로 타입(List) 사용
public class Raw {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(42));
        String s = strings.get(0); // 컴파일러가 자동으로 형변환 코드를 넣어준다.
    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

//    private static void unsafeAdd(List<String> list, String o) {
//        list.add(o);
//    }
}
