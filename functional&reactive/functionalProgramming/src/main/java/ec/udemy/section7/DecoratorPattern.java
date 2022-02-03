package ec.udemy.section7;

import ec.udemy.section7.exampleMethod.Burger;
import ec.udemy.section7.exampleMethod.BurgerShop;

public class DecoratorPattern {

    public static void main(String[] args) {

        Burger burger= new BurgerShop(b->b.addVegies())
                .use(new Burger())
                .addCheese()
                ;
        System.out.println("I get "+ burger);
    }
}
