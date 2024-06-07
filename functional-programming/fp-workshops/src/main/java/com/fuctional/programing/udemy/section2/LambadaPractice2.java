package com.reactive.programming.udemy.reactive.section2;

public class LambadaPractice2 {

    public static void main(String[] args) {
        Operation operation = (a, b) -> System.out.println(a + b);
        operation.MatchOperation(10, 20);


    }
}
