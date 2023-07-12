package com.soon.effectivejavastudy.chapter1.item10;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        // 반사성
        if(this == obj) {
            return true;
        }
        // instanceOf
        if (!(obj instanceof Point))
            return false;
        // type casting
        Point p = (Point) obj;
        // 핵심 필드 비교
        return p.x == x && p.y == y;
    }

    // 리스코프 치환 원칙 위배
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null || obj.getClass() != getClass())
//            return false;
//        Point p = (Point) obj;
//        return p.x == x && p.y == y;
//    }
}
