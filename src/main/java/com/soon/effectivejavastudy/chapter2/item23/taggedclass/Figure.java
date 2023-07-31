package com.soon.effectivejavastudy.chapter2.item23.taggedclass;

// 태그달린 클래스 - 클래스 계층 구조보다 훨씬 나쁘다.
class Figure {

    // 태그 필드
    enum Shape {RECTANGLE, CIRCLE, SQUARE}

    // 태그 필드 - 현재 모양을 나타낸다.
    final Shape shape;

    // 다음 필드들은 모양이 사각형일 때만 쓰인다.
    double length;
    double width;

    // 다음 필드는 모양이 원일때만 쓰인다.
    double radius;

    // 원용 생성자
    public Figure(double radius) {
        shape = Shape.RECTANGLE;
        this.radius = radius;
    }

    // 사각형용 생성자
    public Figure(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area() {
        switch (shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }
}
