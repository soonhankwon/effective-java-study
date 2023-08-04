package com.soon.effectivejavastudy.chapter2.item31;

import com.soon.effectivejavastudy.chapter2.item31.example.Box;
import com.soon.effectivejavastudy.chapter2.item31.example.IntegerBox;

import java.util.Arrays;
import java.util.List;

// 와일드카드 타입을 실제 타입으로 바꿔주는 private 도우미 메서드
public class Swap {

    public static <E> void swap(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

//    public static void swap(List<?> list, int i, int j) {
//        swapHelper(list, i, j);
//    }

    // 와일드카드 타입을 실제 타입으로 바꿔주는 private 도우미 메서드
    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

    public static void main(String[] args) {
        List<String> argList = Arrays.asList(args);
        swap(argList, 0, argList.size() - 1);
        System.out.println(argList);

        Box<Integer> myBox = new IntegerBox(10, "a");
        myBox.change(100);
    }
}
