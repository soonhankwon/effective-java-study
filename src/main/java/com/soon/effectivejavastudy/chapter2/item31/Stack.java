package com.soon.effectivejavastudy.chapter2.item31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;

// 와일드카드 타입을 이용해 대향 작업을 수행하는 메서드를 포함한 제네릭 스택
public class Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    // 배열 elements 는 push(E) 로 넘어온 E 인스턴스만 담는다.
    // 따라서 타입 안전성은 보장하지만,
    // 이 배열의 런타임 타입은 E[]가 아닌 Object[] 다!
    @SuppressWarnings("unchecked")
    public Stack() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        @SuppressWarnings("unchecked")
        E result = (E) elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    // 와일드카드 타입을 사용하지 않은 pushAll 메서드 - 결함이 있다!
//    public void pushAll(Iterable<E> src) {
//        for (E e : src) {
//            push(e);
//        }
//    }

    // E 생산자(producer) 매개변수에 와일드 카드(?) 타입 적용 - 하위타입 사용가능
    public void pushAll(Iterable<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

    // 와일드카드 타입을 사용하지 않은 popAll 메서드 - 결함이 있다!
//    public void popAll(Collection<E> dst) {
//        while(!isEmpty())
//            dst.add(pop());
//    }

    // E 소비자(consumer) 매개변수에 와일드 카드 타입 적용- 상위 타입 허용
    public void popAll(Collection<? super E> dst) {
        while(!isEmpty())
            dst.add(pop());
    }

    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();
        Iterable<Integer> integers = Arrays.asList(3, 1, 4, 1, 5, 9);
        stack.pushAll(integers);

        Iterable<Double> doubles = Arrays.asList(3.1, 2.2, 1.0, 4.0);
        stack.pushAll(doubles);

        // Object > Number
        Collection<Object> objects = new ArrayList<>();
        stack.popAll(objects);
        System.out.println(objects);
    }
}
