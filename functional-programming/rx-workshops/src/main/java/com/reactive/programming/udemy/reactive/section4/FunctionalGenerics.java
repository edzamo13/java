package com.reactive.programming.udemy.reactive.section4;

@FunctionalInterface
public interface FunctionalGenerics<T, R> {

    R execute(T t);
}
