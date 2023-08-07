package com.soon.effectivejavastudy.chapter2.item33.bounded_type_token;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

// asSubclass 를 사용해 한정적 타입 토큰을 안전하게 형변환한다.
public class PrintAnnotation {

    static Annotation getAnnotation(AnnotatedElement elememt, String annotationTypeName) {
        Class<?> annotationType = null; // 비한정적 타입 토큰
        try {
            annotationType = Class.forName(annotationTypeName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return elememt.getAnnotation(annotationType.asSubclass(Annotation.class));
    }

    public static void main(String[] args) {
        System.out.println(getAnnotation(MyService.class, FindMe.class.getName()));
    }
}
