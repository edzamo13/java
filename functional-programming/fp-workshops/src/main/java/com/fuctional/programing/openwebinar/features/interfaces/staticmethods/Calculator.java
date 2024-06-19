package com.fuctional.programing.openwebinar.features.interfaces.staticmethods;

public interface Calculator {

    int sum(int num1, int num2);

    static Calculator getInstance(){
        return new BasicCalculator();
    }
}
