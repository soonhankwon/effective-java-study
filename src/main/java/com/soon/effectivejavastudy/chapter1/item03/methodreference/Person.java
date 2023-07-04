package com.soon.effectivejavastudy.chapter1.item03.methodreference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {

    LocalDate birthday;

    public Person(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }

    //comparable 인터페이스와 매치
    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday) * (-1);
    }

    public int compareByAgeV2(Person a, Person b) {
        return a.birthday.compareTo(b.birthday) * (-1);
    }

    public int compareByAgeV3(Person b) {
        return this.birthday.compareTo(b.birthday) * (-1);
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthday=" + birthday +
                '}';
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(2022, 7 ,7)));
        people.add(new Person(LocalDate.of(1988, 1 ,2)));
        people.add(new Person(LocalDate.of(1986, 8 ,7)));

        // static method reference
//        people.sort(Person::compareByAge);

        // instance method reference
//        Person person = new Person(null);
//        people.sort(person::compareByAgeV2);

        people.sort(Person::compareByAgeV3);
        people.iterator().forEachRemaining(i -> System.out.println(i.getAge()));
    }
}

