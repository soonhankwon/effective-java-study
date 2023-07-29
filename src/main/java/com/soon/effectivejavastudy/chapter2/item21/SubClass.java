package com.soon.effectivejavastudy.chapter2.item21;

public class SubClass extends SuperClass implements MarkerInterface{

    public static void main(String[] args) {
        SubClass subClass = new SubClass();

        /*
         * SuperClass 의 hello 를 사용하게 된다.
         * SuperClass 의 hello 는 private 기 때문에 접근하려고 하면 Exception
         * interface 의 default method 가 런타임 에러를 발생시킬수 있다.
         */

        subClass.hello();
    }
}
