/**
 * Ejemplo de como usar fechas fijas (mes y a�o), como la fecha de caducidad de una tarjeta de cr�dito,
 * haciendo uso de la clase YearMonth.
 */
package ec.workshop.java8.basic.fechas;

import java.time.Month;
import java.time.YearMonth;

/**
 * @author Openwebinars
 *
 */
public class K_FechasFijas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		YearMonth anioYMesActual = YearMonth.now();
		System.out.printf("D�as en la clase MonthYear %s: %d%n", anioYMesActual, anioYMesActual.lengthOfMonth());
		YearMonth caducidadTarjetaCredito = YearMonth.of(2018, Month.FEBRUARY);
		System.out.printf("Su tarjeta de cr�dito caduca en %s ", caducidadTarjetaCredito);

	}

}
