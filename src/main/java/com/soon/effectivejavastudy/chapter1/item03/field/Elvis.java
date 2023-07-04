package com.soon.effectivejavastudy.chapter1.item03.field;

public class Elvis implements IElvis{

    /**
     * singleton object
     */
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    @Override
    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here");
    }

    @Override
    public void sing() {
        System.out.println("I'll have a blue~ Christmas without you~");
    }

    public static void main(String[] args) {
        Elvis instance = Elvis.INSTANCE;
        Elvis instance2 = Elvis.INSTANCE;
        System.out.println(instance == instance2);
        instance.leaveTheBuilding();
        instance.sing();
    }
}
