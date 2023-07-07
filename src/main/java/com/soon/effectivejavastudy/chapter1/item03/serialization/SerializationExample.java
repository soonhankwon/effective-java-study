package com.soon.effectivejavastudy.chapter1.item03.serialization;

import java.io.*;
import java.time.LocalDate;

public class SerializationExample {

    private void serialize(Book book) {
        try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("book.obj"));
            out.writeObject(book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Book deserialize() {
        try {
            ObjectInput in = new ObjectInputStream(new FileInputStream("book.obj"));
            return (Book)in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Book book = new Book("12345", "effective java", "joshua", LocalDate.of(2023, 7, 7));
        book.setNumberOfSold(200);
//        Book.name = "soon"; // static field -> serialization X
        SerializationExample example = new SerializationExample();
        example.serialize(book);
        Book deserializeBook = example.deserialize();

        System.out.println(book);
        System.out.println(deserializeBook);
    }
}
