package com.reactive.programming.udemy.reactive.section6.chaining;

import java.util.function.Function;

public class Chaining {

    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s);
        Consumer<String> c2 = s -> System.out.println(s);

        Consumer<String> c3 = s -> {
            c1.accept(s);
            c2.accept(s);
        };

        c3.accept("Hello!.");

        Consumer<String> c4 = c1.thenAccept(c2);
        c4.accept("BasicStrong !..");

        Function<Integer, Integer> f1 = f -> f + 10;
        Function<Integer, Integer> f2 = m -> m * 3;

        Function<Integer,Integer> function =  f1.andThen(f2);
        System.out.println(function.apply(10));


    }
}
