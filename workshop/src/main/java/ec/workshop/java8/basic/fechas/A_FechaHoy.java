/**
 * Ejemplo de como obtener la fecha actual
 */
package ec.workshop.java8.basic.fechas;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class A_FechaHoy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDate hoy = LocalDate.now();
		System.out.println("La fecha actual es : " + hoy);

	}

}
