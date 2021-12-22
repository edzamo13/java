package com.pluralsight.java.lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstLambda {

    public static void main(String[] args) {

        //Supplier
        Supplier<String> supplier = () -> "Hi world!..";
        System.out.println("valor del supplier is: " + supplier.get());

//Consumer
        Consumer<String> consumer = (String s) -> {
            System.out.println("Other line!.");
            System.out.println(s);
        };
        consumer.accept("Value  you will consume");

    }
}
