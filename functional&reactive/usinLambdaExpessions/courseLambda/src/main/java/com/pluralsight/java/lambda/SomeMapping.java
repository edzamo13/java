package com.pluralsight.java.lambda;

import com.pluralsight.java.lambda.dto.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public class SomeMapping {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Edwin "),
                new User("Patricio "),
                new User("Zamora "),
                new User("Morocho "),
                new User("Paula ")

        );
        List<String> names = new ArrayList<>();
        /*
        List<String> names = new ArrayList<>();
        Function<User, String> function = u -> u.getName();
        for (User u:users) {
            String name= function.apply(u);
            names.add(name);
        }
        users.forEach(System.out::println);
        names.forEach(System.out::println);

         */
/*
        users.stream()
                .map(user -> user.getName())
                .map(s -> {
                    names.add(s);
                    return names;
                });
        users.forEach(System.out::println);
*/
        users.stream().flatMap(Function)


    }
}
