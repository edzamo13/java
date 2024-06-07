package com.reactive.programming.udemy.reactive.section7.exampleMethod;

import com.reactive.programming.udemy.reactive.section6.composition.Function;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<String> cart = new ArrayList<>();
    private String address = "";

    public Order() {

    }

    public Order(List<String> cart, String address) {
        this.cart = cart;
        this.address = address;
    }

    public Order add(String item) {
        this.cart.add(item);
        System.out.println("add item to cart " + item);
        return new Order(this.cart, this.address);
    }

    public Order deliverAt(String location) {
        this.address = location;
        System.out.println("The delivery address set by you is " + location + " '");
        return new Order(this.cart, this.address);
    }

    public void placeII() {
        System.out.println("Order placed!");
        System.out.println(this.cart.size() + " items order by you will be delivered at " + this.address + " by tomorrow");
    }

    public static void place(Function<Order, Order> function) {
        Order order = new Order();
        order = function.apply(order);
        System.out.println("Order placed");
        System.out.println(order.cart.size() + "items ordered by you will be delivered at " + order.address + " by tomorrow");
    }

}
