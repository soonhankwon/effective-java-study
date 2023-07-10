package com.soon.effectivejavastudy.chapter1.item07.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    private Object[] elements; // 메모리 누수 주의 ex) map, set, collection
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object obj) {
        ensureCapacity();
        elements[size++] = obj;
    }

    public Object pop() {
        if(size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // 다 쓴 참조 해제
        return result;
    }

    private void ensureCapacity() {
        if(elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        for(String arg : args)
            stack.push(arg);
        while(true)
            System.err.println(stack.pop());
    }
}
