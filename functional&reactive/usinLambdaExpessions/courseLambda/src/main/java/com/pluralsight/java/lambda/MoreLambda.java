package com.pluralsight.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MoreLambda {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("one", "two", "tree", "four", "five"));
        /* step by step for lambda
        Predicate<String> condition = s -> s.startsWith("t");
        list.removeIf(condition);
        Consumer<String> action = t -> System.out.println(t);
        list.forEach(action);

*/
        list.removeIf(s-> s.startsWith("t"));
        list.forEach(System.out::println);


    }
}
