package com.reactive.programming.udemy.reactive.section1;

public class App2 {
    public static void main(String[] args) {
      /*  MyFuncionalInterface fun = () -> System.out.println("Hello!");
        fun.myMethod();
        */

        onTheFly(()-> System.out.println("Hola !.."));

    }

    public static void onTheFly(MyFuncionalInterface fun) {
        fun.myMethod();

    }
}
