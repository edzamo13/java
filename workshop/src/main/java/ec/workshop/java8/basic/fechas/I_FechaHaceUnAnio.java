/**
 * Ejemplo de como a�adir o restar una cantidad de tiempo a una fecha
 */
package ec.workshop.java8.basic.fechas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Openwebinars
 *
 */
public class I_FechaHaceUnAnio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate previousYear = today.minus(1, ChronoUnit.YEARS);
		System.out.println("Fecha hace un a�o: " + previousYear);
		LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
		System.out.println("Fecha dentro de 1 a�o : " + nextYear);

	}

}
