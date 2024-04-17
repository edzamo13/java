/**
 * Ejemplo de como a�adir horas a una hora en particular
 */
package ec.workshop.java8.basic.fechas;

import java.time.LocalTime;

/**
 * @author Openwebinars
 *
 */
public class G_AniadirHoras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalTime newTime = time.plusHours(2); // a�adiendo dos horas 
		System.out.println("Hora, despu�s de 2 horas : " + newTime);

	}

}
