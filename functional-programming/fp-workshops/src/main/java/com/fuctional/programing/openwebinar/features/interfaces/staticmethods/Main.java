package com.fuctional.programing.openwebinar.features.interfaces.staticmethods;

public class Main {

    public static void main(String[] args) {

        var calculator = Calculator.getInstance();
        System.out.println(calculator.sum(5, 5));
    }
}
