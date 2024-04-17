/**
 * Ejemplo de uso de la clase MonthDay, para representar eventos recurrentes de forma anual
 */
package ec.workshop.java8.basic.fechas;

import java.time.LocalDate;
import java.time.MonthDay;

/**
 * @author Openwebinars
 *
 */
public class E_EventosRecurrentes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate nacimiento = LocalDate.of(2017, 11, 11);
		MonthDay diaNacimiento = MonthDay.of(nacimiento.getMonth(), nacimiento.getDayOfMonth());
		MonthDay diaMesHoy = MonthDay.from(LocalDate.now());
		if (diaMesHoy.equals(diaNacimiento)) {
			System.out.println("Muchas felicidades, porque es tu cumplea�os");
		} else {
			System.out.println("Lo siento, pero no es tu cumplea�os");
		}

	}

}
