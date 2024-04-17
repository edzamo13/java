/**
 * Ejemplo de como obtener, por separado, las cifras correspondientes al d�a, mes y a�o.
 */
package ec.workshop.java8.basic.fechas;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class B_DiaMesAnio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		int year = hoy.getYear();
		int month = hoy.getMonthValue();
		int day = hoy.getDayOfMonth();
		System.out.printf("A�o : %d Mes : %d D�a : %d \t %n", year, month, day);

	}

}
