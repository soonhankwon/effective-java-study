package com.soon.effectivejavastudy.chapter1.item13.clone_use_constructor;

public class Subitem extends Item implements Cloneable{

    private String name;

//    @Override
//    public Subitem clone() {
//        return (Subitem) super.clone();
//    }

    public static void main(String[] args) {
        Subitem item = new Subitem();
        Subitem clone = (Subitem) item.clone();

        System.out.println(clone != null);
        System.out.println(clone.getClass() == item.getClass());
        System.out.println(clone.equals(item));
    }
}
