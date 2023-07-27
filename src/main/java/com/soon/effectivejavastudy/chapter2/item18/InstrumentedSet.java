package com.soon.effectivejavastudy.chapter2.item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// composition
public class InstrumentedSet<E> extends ForwardingSet<E> {

    private int addCount = 0;

    public InstrumentedSet(Set<E> s) {
        super(s);
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
        InstrumentedSet<String> s = new InstrumentedSet<>(new HashSet<>());
        s.addAll(List.of("tic", "tok", "tictok"));
        System.out.println(s.getAddCount());
    }
}
