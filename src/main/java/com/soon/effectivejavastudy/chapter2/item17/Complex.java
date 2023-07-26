package com.soon.effectivejavastudy.chapter2.item17;

import lombok.ToString;

import java.util.Objects;

@ToString
public class Complex {

    private final double re;
    private final double im;

    public static final Complex ZERO = new Complex(0, 0);
    public static final Complex ONE = new Complex(1, 0);
    public static final Complex I = new Complex(0, 1);

    // effective final
    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    private static class MyComplex extends Complex {
        public MyComplex(double re, double im) {
            super(re, im);
        }
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    // private 생성자 + 정적 팩터리
    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    public Complex minus(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex times(Complex c) {
        return new Complex(re * c.re - im * c.im,
                re * c.im + im * c.re);
    }

    public Complex dividedBy(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp,
                (im * c.re - re * c.im) / tmp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.re, re) == 0 && Double.compare(complex.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}
