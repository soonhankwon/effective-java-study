package com.soon.effectivejavastudy.chapter2.item16.dimension;

import lombok.Getter;

import java.awt.*;

public class DimensionExample {

    public DimensionExample() {
    }

    public static void main(String[] args) {
        Button button = new Button("hello button");
        button.setBounds(0,0,20,10);

        Dimension size = button.getSize();
        System.out.println(size.height);
        System.out.println(size.width);
    }

    // 복사해서 사용
    private static void doSomething(Dimension dimension) {
        Dimension dimension1 = new Dimension();
        dimension1.width = dimension.width;
        dimension1.height = dimension.height;
    }

    @Getter
    private static class Button {

        private String label;
        private int x;
        private int y;
        private int width;
        private int height;

        public Button(String label) {
            this.label = label;
        }

        public void setBounds(int x, int y, int width, int height) {
           this.x = x;
           this.y = y;
           this.width = width;
           this.height = height;
        }

        public Dimension getSize() {
            return new Dimension(width, height);
        }
    }
}
