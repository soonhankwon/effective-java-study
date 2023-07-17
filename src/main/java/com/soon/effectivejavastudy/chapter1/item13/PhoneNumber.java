package com.soon.effectivejavastudy.chapter1.item13;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@EqualsAndHashCode
@ToString
public class PhoneNumber implements Cloneable{
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

    @Override
    protected PhoneNumber clone() throws CloneNotSupportedException {
        try {
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static PhoneNumber of(String phoneNumberString) {
        String[] split = phoneNumberString.split("-");
        return new PhoneNumber(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PhoneNumber p = new PhoneNumber(123, 456, 789);
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(p, "jenny");
        PhoneNumber clone = p.clone();
        System.out.println(m.get(clone));

        System.out.println(clone != p);
        System.out.println(clone.getClass() == p.getClass());
        System.out.println(clone.equals(p));
    }
}
