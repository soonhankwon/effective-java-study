package com.soon.effectivejavastudy.chapter2.item23.hierarchy;

class Circle extends Figure{

    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }
}
