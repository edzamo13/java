package com.reactive.programming.udemy.reactive.section6;

public class PreFuction {

    public static void main(String[] args) {

        int result= add(multyply(3,2),multyply(5,5));
        System.out.println(result);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multyply(int a, int b) {
        log(String.format("Returning %s as the result of %s * %s", a*b,a,b));
        return a * b;
    }

    private static void log(String format) {
        System.out.println(format);
    }

}
