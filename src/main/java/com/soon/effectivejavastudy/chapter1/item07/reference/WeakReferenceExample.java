package com.soon.effectivejavastudy.chapter1.item07.reference;

import java.lang.ref.WeakReference;

public class WeakReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        Object strong = new Object();
        WeakReference<Object> weak = new WeakReference<>(strong);
        strong = null;

        System.gc();
        Thread.sleep(3000L);

        // 거의 없어짐 (weak)
        System.out.println(weak.get());
    }
}
