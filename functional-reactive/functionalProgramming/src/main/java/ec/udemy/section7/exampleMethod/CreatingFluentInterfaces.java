package ec.udemy.section7.exampleMethod;

import ec.udemy.section7.exampleMethod.Order;

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
