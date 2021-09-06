package com.formos.vendor.dto;

import lombok.Getter;
import lombok.Setter;

public class Inventory {

	@Getter
	@Setter
	private Integer id;
	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private String typeMeasure;
	@Getter
	@Setter
	private Integer quantity;
	@Getter
	@Setter
	private String type;
	@Getter
	@Setter
	private Double salePrice;
	@Getter
	@Setter
	private Double accounting;

	public Inventory() {
	}


	public Inventory(Integer id, String name, String typeMeasure, Integer quantity, String type, Double salePrice,
			Double accounting) {
		super();
		this.id = id;
		this.name = name;
		this.typeMeasure = typeMeasure;
		this.quantity = quantity;
		this.type = type;
		this.salePrice = salePrice;
		this.accounting = accounting;
	}


	@Override
	public String toString() {
		return "Inventory [id=" + id + ", name=" + name + ", typeMeasure=" + typeMeasure + ", quantity=" + quantity
				+ ", type=" + type + ", salePrice=" + salePrice + ", accounting=" + accounting + "] \n";
	}

}
