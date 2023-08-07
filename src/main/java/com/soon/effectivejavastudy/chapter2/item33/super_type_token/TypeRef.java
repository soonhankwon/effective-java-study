package com.soon.effectivejavastudy.chapter2.item33.super_type_token;

import lombok.EqualsAndHashCode;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@EqualsAndHashCode
public abstract class TypeRef<T> {

    private final Type type;

    protected TypeRef() {
        ParameterizedType superclass = (ParameterizedType) getClass().getGenericSuperclass();
        type = superclass.getActualTypeArguments()[0];
    }

    public Type getType() {
        return this.type;
    }
}
