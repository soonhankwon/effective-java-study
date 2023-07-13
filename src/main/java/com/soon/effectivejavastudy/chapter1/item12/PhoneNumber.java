package com.soon.effectivejavastudy.chapter1.item12;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if(val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    public static PhoneNumber of(String phoneNumberString) {
        String[] split = phoneNumberString.split("-");
        return new PhoneNumber(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
    }

    public static void main(String[] args) {
        PhoneNumber p = new PhoneNumber(123, 456, 789);
        System.out.println(p);
        PhoneNumber pn = PhoneNumber.of("123-456-789");
        System.out.println(pn);
        System.out.println(p.equals(pn));
    }
}
