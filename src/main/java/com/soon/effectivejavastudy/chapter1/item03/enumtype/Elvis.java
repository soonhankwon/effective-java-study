package com.soon.effectivejavastudy.chapter1.item03.enumtype;

import com.soon.effectivejavastudy.chapter1.item03.field.IElvis;

// enum type singleton -> reflection, deserialization safe
public enum Elvis implements IElvis {

    INSTANCE;

    public static void main(String[] args) {
        Elvis elvis1 = Elvis.INSTANCE;
        Elvis elvis2 = Elvis.INSTANCE;
        elvis1.leaveTheBuilding();
        System.out.println(elvis1 == elvis2);
    }

    @Override
    public void sing() {
        System.out.println("test class 에서  IElvis 인터페이스로 Mocking 가능");
    }

    @Override
    public void leaveTheBuilding() {
        System.out.println("Elvis.leaveTheBuilder");
    }
}
