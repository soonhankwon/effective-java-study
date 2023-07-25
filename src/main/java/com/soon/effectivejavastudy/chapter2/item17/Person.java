package com.soon.effectivejavastudy.chapter2.item17;

public final class Person {

    private final Address address;

    public Person(Address address) {
        this.address = address;
    }

    public Address getAddress(Address address) {
        Address copyOfAddress = new Address();
        copyOfAddress.setStreet(address.getStreet());
        copyOfAddress.setZipCode(address.getZipCode());
        copyOfAddress.setCity(address.getCity());
        return copyOfAddress;
    }

    public static void main(String[] args) {
        Address seattle = new Address();
        seattle.setCity("seattle");

        Person person = new Person(seattle);
        Address address1 = person.getAddress(seattle);
        address1.setCity("redmond");

        System.out.println(person.address.getCity());
    }
}
