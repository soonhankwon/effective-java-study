package com.soon.effectivejavastudy.chapter1.item14;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;

@Getter
@EqualsAndHashCode
@ToString
public class PhoneNumber implements Comparable<PhoneNumber> {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    private static final Comparator<PhoneNumber> COMPARATOR =
            Comparator.comparingInt(PhoneNumber::getAreaCode)
                    .thenComparingInt(PhoneNumber::getPrefix)
                    .thenComparingInt(PhoneNumber::getLineNum);

    @Override
    public int compareTo(PhoneNumber pn) {
        return COMPARATOR.compare(this, pn);
    }

    public static void main(String[] args) {
        PhoneNumber pn1 = new PhoneNumber(123, 456, 789);
        PhoneNumber pn2 = new PhoneNumber(123, 456, 779);
        PhoneNumber pn3 = new PhoneNumber(123, 456, 769);

        ArrayList<PhoneNumber> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(pn1);
        phoneNumbers.add(pn2);
        phoneNumbers.add(pn3);

        phoneNumbers.sort(PhoneNumber::compareTo);
        System.out.println(phoneNumbers);
    }
}
