package com.formos.vendor.fruit.fruit;

import java.util.List;

import com.formos.vendor.dto.Inventory;

import lombok.Getter;
import lombok.Setter;

public class Order implements ItemOrder {

	@Getter
	@Setter
	private List<Inventory> inventories;
	@Getter
	@Setter
	private Integer idFruit;
	@Getter
	@Setter
	private Integer typeMeasure;
	@Getter
	@Setter
	private Double sellout;
	

	@Override
	public Order accept(ShoppingCartVisitor visitor) {
		return visitor.visitPrepareJuice(this);
	}

	@Override
	public Order acceptSellout(ShoppingCartVisitor visitor) {
		return visitor.visitSellout(this);
	}



}
