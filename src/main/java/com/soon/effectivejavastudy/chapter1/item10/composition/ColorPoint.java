package com.soon.effectivejavastudy.chapter1.item10.composition;

import com.soon.effectivejavastudy.chapter1.item10.Color;
import com.soon.effectivejavastudy.chapter1.item10.Point;

import java.util.Objects;

public class ColorPoint {

    private Point point;
    private Color color;

    public ColorPoint(int x,  int y, Color color) {
        point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    public Point asPoint() {
        return this.point;
    }
}
