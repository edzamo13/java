package com.reactive.programming.udemy.reactive.section7.exampleMethod;

public class CreatingFluentInterfaces {

    public static void main(String[] args) {
        new Order()
                .add("Shoes")
                .add("Jean")
                .add("t-shirt")
                .deliverAt("Street ciudadela Ejercito")
        ;
    }
}
