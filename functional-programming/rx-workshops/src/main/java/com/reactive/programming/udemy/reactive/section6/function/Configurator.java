package com.reactive.programming.udemy.reactive.section6.function;

public interface Configurator<T,R> {

    R configure(T t);
}
