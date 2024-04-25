package ec.udemy.section7.exampleMethod.factoryMethod;

import java.util.function.Supplier;

public class FlooringFactory {
    public static Flooring getFlooring(int minTemperature, int maxTemperature) {
        Supplier<Flooring> flooringSupplier;

        if (minTemperature <= 5 && maxTemperature <= 20) {
            flooringSupplier = () -> new WoodenFlooring();
        } else if (minTemperature <= 5 && maxTemperature >= 45) {
            flooringSupplier = () -> new CorkFlooring();
        } else {
            flooringSupplier = () -> new ConcreteFlooring();
        }
        return flooringSupplier.get();
    }
}
