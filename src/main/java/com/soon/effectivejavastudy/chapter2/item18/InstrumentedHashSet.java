package com.soon.effectivejavastudy.chapter2.item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

// 상속을 잘못 사용한 예
public class InstrumentedHashSet<E> extends HashSet<E> {

    private int addCount = 0;

    public InstrumentedHashSet() {}

    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("tic", "tok", "tictok"));
        // result -> 6 (상위 클래스의 내부 구현에 의해)
        System.out.println(s.getAddCount());
    }
}
