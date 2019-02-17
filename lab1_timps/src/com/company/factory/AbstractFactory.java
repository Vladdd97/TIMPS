package com.company.factory;

//Abstract factory design pattern
public interface AbstractFactory<T> {
    T create(String type);
}
