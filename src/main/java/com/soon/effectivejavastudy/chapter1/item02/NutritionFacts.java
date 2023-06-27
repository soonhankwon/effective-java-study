package com.soon.effectivejavastudy.chapter1.item02;

//constructor chaining
public class NutritionFacts {

    private final int servingSize; //(mL, 1회 제공량) 필수
    private final int serving; // (회, 총 n회 제공량) 필수
    private final int calories; // (1회 제공량당) 선택
    private final int fat; // (g/1회 제공량) 선택
    private final int sodium; // (mg/1회 제공량) 선택
    private final int carbohydrate; // (g/1회 제공량) 선택

    public NutritionFacts(int servingSize, int serving) {
        this(servingSize, serving, 0);
    }

    public NutritionFacts(int servingSize, int serving, int calories) {
        this(servingSize, serving, calories, 0);
    }

    public NutritionFacts(int servingSize, int serving, int calories, int fat) {
        this(servingSize, serving, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int serving, int calories, int fat, int sodium) {
        this(servingSize, serving, calories, fat, sodium, 0);
    }

    public NutritionFacts(int servingSize, int serving, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.serving = serving;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }


    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts(240, 8);
        System.out.println(cocaCola);
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", serving=" + serving +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
