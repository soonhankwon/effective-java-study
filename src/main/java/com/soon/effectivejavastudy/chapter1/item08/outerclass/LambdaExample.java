package com.soon.effectivejavastudy.chapter1.item08.outerclass;

import java.lang.reflect.Field;

public class LambdaExample {

    private int value = 10;

    private Runnable instanceLambda = () -> {
        System.out.println(value);
        //cleaner 시 순환 참조 -> 사용 X
    };

    public static void main(String[] args) {
        LambdaExample example = new LambdaExample();
        Field[] declaredFields = example.instanceLambda.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("field type:" + field.getType());
            System.out.println("field name:" + field.getName());
        }
    }
}
