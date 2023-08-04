package com.soon.effectivejavastudy.chapter2.item30.before;

import java.util.function.Function;

// 제네릭 싱글톤 팩터리 패턴
public class GenericSingletonFactory {

    public static Function<String, String> stringIdentityFunction() {
        return (t) -> t;
    }

    public static Function<Number, Number> integerIdentityFunction() {
        return (t) -> t;
    }

    // 제네릭 싱글턴을 사용하는 예
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c"};
        Function<String, String> sameString = stringIdentityFunction();
        for (String s : strings) {
            System.out.println(sameString.apply(s));
        }

        Number[] numbers = {1,2.0,3L};
        Function<Number, Number> sameNumber = integerIdentityFunction();
        for (Number n : numbers) {
            System.out.println(sameNumber.apply(n));
        }
    }
}
