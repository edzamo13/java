package com.formos.vendor.enumerador;

import lombok.Getter;

public enum EnumType {
	QUANTITY_FRUITS("3", " cantidad de frutas y tipos para este proyecto"),
	GRAMOS("gr", " gramos"),
	MILILITROS("ml", " Mililitros"),
	SIZE_100("100", " ml"),
	SIZE_200("200", " ml"),
	SIZE_300("300", " ml"),
	OTHERS("o", " otro"),
	   FRUIT("f", " fruta"),
	  VENDOR("p", "persona"),
	  CLIENT("c", "Cliente");
	

	@Getter
	private String code;
	@Getter
	private String description;

	private EnumType(String code, String description) {
		this.code = code;
		this.description = description;
	}

}
