package com.blogspot.tizamo.pizzeria;

import lombok.Getter;
import lombok.Setter;

public class Cocinero {

	@Getter
	@Setter
	private String nombre;
	@Getter
	@Setter
	private Pizza pizza_1;
	@Getter
	@Setter
	private Pizza pizza_2;

	public Cocinero() {
		
	}

	public int darUnidadesProducidas() {

		return pizza_1.darCantidadProducida() + pizza_2.darCantidadProducida();

	}
	
	

}
