
package com.formos.vendor.fruit.fruit;

public interface ShoppingCartVisitor {

	Order visitPrepareJuice(Order order);

	Order visitSellout(Order order);
}
