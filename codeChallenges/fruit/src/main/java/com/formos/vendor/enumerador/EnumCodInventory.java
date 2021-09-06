package com.formos.vendor.enumerador;

import lombok.Getter;

public enum EnumCodInventory {
	
	COD_Strawberry(1,"Strawberry",50),
	COD_BANANA(2,"Banana",60),
	COD_MANGO(3,"Mango",70),
	COD_ICE(	4,	"Ice",30),
	COD_MILK(5,"Milk",20),
    COD_SUGAR(6,"Sugar",8);
		

	@Getter
	private Integer code;
	@Getter
	private String description;
	@Getter
	private Integer quantity;


	private EnumCodInventory(Integer code, String description,Integer quantity) {
		this.code = code;
		this.description = description;
		this.quantity=quantity;
	}

}
