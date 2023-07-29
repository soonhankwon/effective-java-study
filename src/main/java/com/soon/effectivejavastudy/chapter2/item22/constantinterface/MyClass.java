package com.soon.effectivejavastudy.chapter2.item22.constantinterface;

public class MyClass implements PhysicalConstants {

    private static final double AVOGADROS_NUMBER = 6.022_140_857e23;
    private static final double BOLTZMAN_CONSTANT = 1.380_648_52e-23;
    private static final double ELECTRON_MASS = 9.109_383_56e-31;

    public static void main(String[] args) {
        System.out.println(BOLTZMAN_CONSTANT);
    }
}
