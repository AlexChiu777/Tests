package com.hibernate.data.entities.sakila;

import java.lang.reflect.ParameterizedType;

/**
 * Created by Alex on 5/13/2015.
 */
public class Test<T> {
    private Class<T> tClass;
    public Test() {
        this.tClass = (Class<T>)  ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments().getClass().getClass();

    }
}
