package ec.udemy.section7;

import ec.udemy.section7.exampleMethod.factoryMethod.Flooring;
import ec.udemy.section7.exampleMethod.factoryMethod.FlooringFactory;

public class FactoryMethodPattern {
    public static void main(String[] args) {

        Flooring flooring= FlooringFactory.getFlooring(-1,18);
        flooring.instalation();
    }
}
