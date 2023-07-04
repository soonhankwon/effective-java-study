package com.soon.effectivejavastudy.chapter1.item03.field;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

public class ElvisSerializationTest {

    @Test
    void serializationAndDeserialization() {
        try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"));
            out.writeObject(Elvis.INSTANCE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"));
            Elvis elvis = (Elvis) in.readObject();
            assertThat(elvis).isEqualTo(Elvis.INSTANCE);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
