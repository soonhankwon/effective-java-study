package com.soon.effectivejavastudy.chapter2.item33.type_token;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Favorites {

    private Map<Class<?>, Object> map = new HashMap<>();

    public <T> void put(Class<T> clazz, T value) {
        this.map.put(Objects.requireNonNull(clazz), clazz.cast(value));
    }

    public <T> T get(Class<T> clazz) {
        // cast check
        return clazz.cast(this.map.get(clazz));
    }

    public static void main(String[] args) {
        Favorites favorites = new Favorites();
//        favorites.put(String.class, 1);
        favorites.put(String.class, "soon");
//        favorites.put((Class)Integer.class, "soon");
        favorites.put(Integer.class, 2);
        favorites.put(List.class, List.of(1, 2, 3));
        favorites.put(List.class, List.of("a", "b", "c"));

        List list = favorites.get(List.class);
        list.forEach(System.out::println);

        String s = favorites.get(String.class);
        Integer integer = favorites.get(Integer.class);

        System.out.println(s);
        System.out.println(integer);
    }
}
