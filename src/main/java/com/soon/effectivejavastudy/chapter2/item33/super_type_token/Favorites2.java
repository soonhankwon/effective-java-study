package com.soon.effectivejavastudy.chapter2.item33.super_type_token;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Favorites2 {

    private final Map<TypeRef<?>, Object> favorites = new HashMap<>();

    public <T> void put(TypeRef<T> typeRef, T thing) {
        favorites.put(typeRef, thing);
    }

    @SuppressWarnings("unchecked")
    public <T> T get(TypeRef<T> typeRef) {
        return (T) favorites.get(typeRef);
    }

    public static void main(String[] args) {
        Favorites2 f = new Favorites2();

        f.put(new TypeRef<List<String>>(){}, List.of("a", "b", "c"));
        f.put(new TypeRef<List<Integer>>(){}, List.of(1, 2, 3));
        f.get(new TypeRef<List<String>>(){}).forEach(System.out::println);
        f.get(new TypeRef<List<Integer>>(){}).forEach(System.out::println);
    }
}
