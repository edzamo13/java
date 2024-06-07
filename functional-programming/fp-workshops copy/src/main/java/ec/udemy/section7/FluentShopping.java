package ec.udemy.section7;

import ec.udemy.section7.exampleMethod.Order;

public class FluentShopping {

    public static void main(String[] args) {
        Order.place(order ->
                order
                        .add("Shoes")
                        .add("Jean")
                        .add("t-shirt")
                        .deliverAt("Street ciudadela Ejercito")

        );
    }
}
