package com.fuctional.programing.platzi._06_reference_operator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodRefence {
    public static void main(String[] args) {
        List<String> getList = getList("edwin", "patricio", "Zamora");

       getList.forEach(System.out::println);
    }

    static <T> List<T> getList(T... element) {
        return Arrays.asList(element);
    }
}
