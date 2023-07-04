package com.soon.effectivejavastudy.chapter1.item03.staticfactory;

public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    public Elvis() {
    }

    public static Elvis getInstance() {
        return new Elvis();
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();

        System.out.println(Elvis.getInstance());
        System.out.println(Elvis.getInstance());
    }
}
