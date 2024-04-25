package ec.udemy.section4;

import java.util.function.Supplier;

public class SupplierPractice {

    public static void main(String[] args) {
        Supplier<String> stringSupplier= ()-> new String("Value of String");
        System.out.println(stringSupplier.get());

        Supplier<Double> doubleSupplier= ()-> Math.random();
        System.out.println(doubleSupplier.get());
    }
}
