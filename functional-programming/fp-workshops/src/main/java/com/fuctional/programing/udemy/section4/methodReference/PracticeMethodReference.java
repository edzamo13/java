package com.reactive.programming.udemy.reactive.section4.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class PracticeMethodReference {

    public static void main(String[] args) {
        //object:: instance Method
        //Method reference to an instace
        object_instanceMethod();
        //class:static Method
        //Method reference to a static method of a class.
        class_staticMethod();
        //class::instanceMethod
        //Method reference to an instance method of an input object of a particular type
        class_instanceMethod();
        //class::new
        //Method reference to a constructor
        class_new();


    }

    private static void object_instanceMethod() {
        //List.of(1, 2, 3); deprecate in java 11
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 19, 12);
        //object:: instance Method
        //Method reference to an instance method of an existing object.
        //  System.out     :: println
        //  existing Object :: instance Method
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(56);
        printElements(list, consumer);

    }


    private static void class_staticMethod() {
        //  Math :: random
        // Class :: static Method
        Supplier<Double> radomNumber = Math::random;
        System.out.println(new StringBuilder().append("random Number: ").append(radomNumber.get()).toString());
    }

    private static void class_instanceMethod() {
        BiFunction<String, String, String> biFunction = A_class::staticMethod;
        System.out.println("join among two word"+biFunction.apply("basic", "strong"));
    }

    private static void class_new() {
        Function<String, Integer> lengthOfString = String::length;
        System.out.println("this is a length of string: " + lengthOfString.apply("hi"));
    }

    private static <T> void printElements(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

}


class A_class {
    static String staticMethod(String a, String b) {
        return a + b;
    }
}