package com.soon.effectivejavastudy.chapter1.item03.field;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ElvisReflectionTest {

    @Test
    void singletonAndDefendReflectionTest() {
        try {
            Constructor<Elvis> defaultConstructor = Elvis.class.getDeclaredConstructor();
            defaultConstructor.setAccessible(true);
            Elvis.INSTANCE.sing();
            Elvis elvis1 = defaultConstructor.newInstance();
            Elvis elvis2 = defaultConstructor.newInstance();
            System.out.println(elvis1 == elvis2);

        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            Assertions.assertThat(e).isInstanceOf(InvocationTargetException.class);
            e.printStackTrace();
        }
    }
}
