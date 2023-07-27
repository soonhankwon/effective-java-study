package com.soon.effectivejavastudy.chapter2.item19.constructor;

public class Super {

    // 잘못된 예
    public Super() {
        overrideMe();
    }

    public void overrideMe() {
    }
}
