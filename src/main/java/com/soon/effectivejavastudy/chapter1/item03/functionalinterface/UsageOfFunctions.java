package com.soon.effectivejavastudy.chapter1.item03.functionalinterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsageOfFunctions {

    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2022, 7, 7));
        dates.add(LocalDate.of(1988, 1, 2));
        dates.add(LocalDate.of(1986, 8, 7));

        List<Integer> before2000 = dates.stream()
                .filter(d -> d.isBefore(LocalDate.of(2000, 1, 1)))
                .map(LocalDate::getYear)
                .collect(Collectors.toList());
    }
}
