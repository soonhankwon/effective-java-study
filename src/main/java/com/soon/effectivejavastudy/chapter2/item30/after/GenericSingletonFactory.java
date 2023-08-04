package com.soon.effectivejavastudy.chapter2.item30.after;

import java.util.function.Function;
import java.util.function.UnaryOperator;

// 제네릭 싱글톤 팩터리 패턴
public class GenericSingletonFactory {

    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) IDENTITY_FN;
    }

    // 제네릭 싱글턴을 사용하는 예
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c"};
        Function<String, String> sameString = identityFunction();
        for (String s : strings) {
            System.out.println(sameString.apply(s));
        }

        Number[] numbers = {1, 2.0, 3L};
        Function<Number, Number> sameNumber = identityFunction();
        for (Number n : numbers) {
            System.out.println(sameNumber.apply(n));
        }
    }
}
