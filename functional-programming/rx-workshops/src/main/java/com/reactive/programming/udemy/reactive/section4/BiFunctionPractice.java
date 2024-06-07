package com.reactive.programming.udemy.reactive.section4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionPractice {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("royal", "yamaha", "honda", "bmw", "trigger");
        BiFunction<String, String, String> biFunction = (t, u) -> u + t;

        List<String> strings = concatValue(list, biFunction);
        System.out.println(strings);

    }

    private static <T, U, R> List<R> concatValue(List<T> list, BiFunction<T, U, R> biFunction) {
        List<R> rList = new ArrayList<>();
        for (T t : list) {
            rList.add(biFunction.apply(t, (U) "moto "));
        }
        return rList;
    }
}
