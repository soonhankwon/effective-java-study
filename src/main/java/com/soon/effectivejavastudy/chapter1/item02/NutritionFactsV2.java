package com.soon.effectivejavastudy.chapter1.item02;

// java beans pattern - no immutable
public class NutritionFactsV2 {

    private int servingSize = -1; //(mL, 1회 제공량) 필수
    private int serving = -1; // (회, 총 n회 제공량) 필수
    private int calories; // (1회 제공량당) 선택
    private int fat; // (g/1회 제공량) 선택
    private int sodium; // (mg/1회 제공량) 선택
    private int carbohydrate; // (g/1회 제공량) 선택

    public NutritionFactsV2() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFactsV2 cocaCola = new NutritionFactsV2();
        cocaCola.setServingSize(240);
        cocaCola.setServing(8);
        cocaCola.setCalories(100);
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
