package com.reactive.programming.udemy.reactive.section6.function;

public class HighOrderFunctions {

    public static void main(String[] args) {
      Factory<Integer> factory=  createFactory(() -> Math.random() * 100, r -> r.intValue());
      Integer product= factory.create();
        System.out.println(product);
    }

    public static <T, R> Factory<R> createFactory(Producer<T> tProducer, Configurator<T, R> tConfigurator) {
        return () -> {
            T product = tProducer.produce();
            return tConfigurator.configure(product);
        };
    }
}
