package com.soon.effectivejavastudy.chapter1.item02;

// Builder pattern
public class NutritionFactsV3 {

    private final int servingSize; //(mL, 1회 제공량) 필수
    private final int serving; // (회, 총 n회 제공량) 필수
    private final int calories; // (1회 제공량당) 선택
    private final int fat; // (g/1회 제공량) 선택
    private final int sodium; // (mg/1회 제공량) 선택
    private final int carbohydrate; // (g/1회 제공량) 선택

    public NutritionFactsV3(Builder builder) {
        this.servingSize = builder.servingSize;
        this.serving = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public static class Builder {
        // required parameter
        private final int servingSize;
        private final int servings;

        // optional parameter
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFactsV3 build() {
            return new NutritionFactsV3(this);
        }
    }

    public static void main(String[] args) {
        NutritionFactsV3 cocaCola = new Builder(240, 8)
                .calories(100)
                .carbohydrate(35)
                .sodium(27).build();

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
