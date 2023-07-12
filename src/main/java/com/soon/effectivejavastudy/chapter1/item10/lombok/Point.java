package com.soon.effectivejavastudy.chapter1.item10.lombok;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Objects;

// 비정석
@EqualsAndHashCode
@ToString
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        System.out.println(point1.equals(point2));
    }
}
