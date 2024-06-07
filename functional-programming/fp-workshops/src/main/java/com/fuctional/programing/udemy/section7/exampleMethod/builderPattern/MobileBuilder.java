package com.reactive.programming.udemy.reactive.section7.exampleMethod.builderPattern;


import java.util.function.Consumer;

public class MobileBuilder {

    int ram, storage;
    int battery;
    int camera;
    String processor;
    double screenSize;

    public MobileBuilder with(Consumer<MobileBuilder> builderConsumer) {
        builderConsumer.accept(this);
        return this;
    }

    public Mobile createMobile() {
        return new Mobile(this);
    }
}
