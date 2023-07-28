package com.soon.effectivejavastudy.chapter2.item20.multipleinheritance;

public class MyCat extends AbstractCat implements Flyable {

    private MyFlayble myFlayble = new MyFlayble();

    @Override
    protected String sound() {
        return "CAT CAT";
    }

    @Override
    protected String name() {
        return "SOON";
    }

    @Override
    public void fly() {
        this.myFlayble.fly();
    }

    private class MyFlayble extends AbstractFlyable {
        @Override
        public void fly() {
            System.out.println("CAN FLY!!!!!!!");
        }
    }

    public static void main(String[] args) {
        MyCat myCat = new MyCat();
        System.out.println(myCat.sound());
        System.out.println(myCat.name());
        myCat.fly();
    }
}
