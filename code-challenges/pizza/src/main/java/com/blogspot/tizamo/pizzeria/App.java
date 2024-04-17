package com.blogspot.tizamo.pizzeria;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hola Pizzeria ");

		Cocinero cocinero = new Cocinero();
		cocinero.setPizza_1(new Pizza("Jamon y Champiñones", 10, 5, 15));
		cocinero.setPizza_2(new Pizza("Jamo y Queso", 8, 5, 10));
		System.out.println("Ganancia Unitaria Pizza 1: " + cocinero.getPizza_1().darGananciaUnitaria());
		System.out.println("Ganancia Total Pizza 1: " + cocinero.getPizza_1().darGananciaTotal());
		System.out.println("Ganancia Unitaria Pizza 2: " + cocinero.getPizza_2().darGananciaUnitaria());
		System.out.println("Ganancia Total Pizza 2: " + cocinero.getPizza_2().darGananciaTotal());
		System.out.println("Ganancia Pizzas:" + cocinero.darUnidadesProducidas());
		}
}
