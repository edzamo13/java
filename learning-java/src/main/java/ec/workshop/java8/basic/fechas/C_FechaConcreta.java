/**
 * Ejemplo de como obtener una fecha concreta a partir
 * de su d�a, mes y a�o.
 */
package ec.workshop.java8.basic.fechas;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class C_FechaConcreta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDate nacimiento = LocalDate.of(1982, 9, 18);
		System.out.println("Tu fecha de nacimiento es : " + nacimiento);

	}

}
