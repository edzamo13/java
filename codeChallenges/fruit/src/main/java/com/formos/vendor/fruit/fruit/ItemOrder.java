package com.formos.vendor.fruit.fruit;

public interface ItemOrder {
	
	public Order accept(ShoppingCartVisitor visitor);
	
	public Order acceptSellout(ShoppingCartVisitor visitor);
}
