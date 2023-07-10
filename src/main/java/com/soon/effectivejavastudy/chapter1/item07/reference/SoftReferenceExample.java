package com.soon.effectivejavastudy.chapter1.item07.reference;

import java.lang.ref.SoftReference;

public class SoftReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        Object strong = new Object();
        SoftReference<Object> soft = new SoftReference<>(strong);
        strong = null;

        System.gc();
        Thread.sleep(3000L);

        // 메모리가 불충분한 경우만 제거
        System.out.println(soft.get());
    }
}
