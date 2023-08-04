package com.soon.effectivejavastudy.chapter2.item26.terms;

// Generic Class 정의 - 타입 매개변수
// <E extends Number> 한정적 타입 매개변수
public class Box<E extends Number> {

    private E item;

    private void add(E e) {
        this.item = e;
    }

    private E get() {
        return this.item;
    }

    public static void main(String[] args) {
        // 사용하는 쪽 - 실제 타입 매개변수 (매개변수화 타입)
        Box<Integer> box = new Box<>();

        // 비한정적 와일드 카드 타입
//        Box<?> box = new Box<>();

        box.add(10);
        printBox(box);
    }

    private static void printBox(Box<?> box) {
        System.out.println(box.get());
    }
}
