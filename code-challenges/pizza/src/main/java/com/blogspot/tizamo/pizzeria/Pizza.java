package com.blogspot.tizamo.pizzeria;

import lombok.Getter;
import lombok.Setter;

public class Pizza {

	@Getter
	@Setter
	private String nombre;
	@Getter
	@Setter
	private double costoProduccion;
	@Getter
	@Setter
	private int cantidadProducida;
	@Getter
	@Setter
	private double precioDeVenta;

	public Pizza(String nombre, double costoProducion, int cantidadProducida, double precioDeVenta) {
		super();
		this.nombre = nombre;
		this.costoProduccion = costoProducion;
		this.cantidadProducida = cantidadProducida;
		this.precioDeVenta = precioDeVenta;
	}

	public int darCantidadProducida() {
		return getCantidadProducida();
	}

	public void modificarPrecioVenta(double nuevoPrecio) {
		setPrecioDeVenta(nuevoPrecio);

	}

	public double darGananciaUnitaria() {
		return getPrecioDeVenta() - getCostoProduccion();
	}

	public double darGananciaTotal() {
		double resta = darGananciaUnitaria();
		return resta * getCantidadProducida();
	}

}
