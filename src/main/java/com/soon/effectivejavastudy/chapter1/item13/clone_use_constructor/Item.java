package com.soon.effectivejavastudy.chapter1.item13.clone_use_constructor;

public class Item implements Cloneable{

    private String name;

    @Override
    public Item clone() {
        Item result = null;
        try {
            result = (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
        return result;
    }
}
