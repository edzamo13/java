package com.reactive.programming.udemy.reactive.section7;

import com.reactive.programming.udemy.reactive.section7.exampleMethod.factoryMethod.Flooring;
import com.reactive.programming.udemy.reactive.section7.exampleMethod.factoryMethod.FlooringFactory;

public class FactoryMethodPattern {
    public static void main(String[] args) {

        Flooring flooring= FlooringFactory.getFlooring(-1,18);
        flooring.instalation();
    }
}
