package com.soon.effectivejavastudy.chapter2.item29.bounded_type;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

// E[]를 이용한 제네릭 스택
public class Stack<E extends Number> {
    private Number[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    // 배열 elements 는 push(E) 로 넘어온 E 인스턴스만 담는다.
    // 따라서 타입 안전성은 보장하지만,
    // 이 배열의 런타임 타입은 E[]가 아닌 Object[] 다!
    public Stack() {
        elements = new Number[DEFAULT_INITIAL_CAPACITY];
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

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (Integer arg : List.of(1, 2, 3))
            stack.push(arg);
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
