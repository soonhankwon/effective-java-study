package com.soon.effectivejavastudy.chapter1.item10.inheritance;

import com.soon.effectivejavastudy.chapter1.item10.Color;
import com.soon.effectivejavastudy.chapter1.item10.Point;

public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }
    // 대칭성 위반 코드
//    @Override
//    public boolean equals(Object obj) {
//        if(!(obj instanceof ColorPoint))
//            return false;
//        return super.equals(obj) && ((ColorPoint) obj).color == color;
//    }

    // 추이성 위반 코드
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Point))
            return false;
        // 동일 레벨의 클래스가 있다면 stack over flow
        if(!(obj instanceof ColorPoint)) {
            return obj.equals(this);
        }
        return super.equals(obj) && ((ColorPoint) obj).color == color;
    }

    public static void main(String[] args) {
        // 대칭성 위반
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        ColorPoint cp2 = new ColorPoint(1, 2, Color.BLUE);
//        System.out.println(p.equals(cp) + " " + cp.equals(p));
        // 추이성 위반
        System.out.println(p.equals(cp) + " " + cp.equals(cp2) + " " + p.equals(cp2));
    }
}
