package com.soon.effectivejavastudy.chapter1.item03.field;

public class MockElvis implements IElvis{
    @Override
    public void sing() {
        System.out.println("MOCK SING");
    }

    @Override
    public void leaveTheBuilding() {
        System.out.println("MOCK LEAVE THE BUILDING");
    }
}
