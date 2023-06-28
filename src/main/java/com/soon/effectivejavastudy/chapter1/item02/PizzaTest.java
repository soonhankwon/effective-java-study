package com.soon.effectivejavastudy.chapter1.item02;

// 계층형 빌더
public class PizzaTest {
    public static void main(String[] args) {
        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM)
                .sauceInside()
                .build();

        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.MUSHROOM)
                .build();

        System.out.println(calzone);
        System.out.println(nyPizza);
    }
}
