/**
 * Ejemplo de como verificar si el a�o de una fecha es bisiesto
 */
package ec.workshop.java8.basic.fechas;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class L_Bisiesto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		if (today.isLeapYear()) {
			System.out.println("Este a�o es bisiesto");
		} else {
			System.out.println("Este a�o no es bisiesto");
		}

	}

}
