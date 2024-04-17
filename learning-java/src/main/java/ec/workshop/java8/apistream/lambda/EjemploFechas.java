/**
 * ALGUNOS SENCILLOS EJEMPLOS DEL USO DE FECHAS EN JAVA SE 8 
 */
package ec.workshop.java8.apistream.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

/**
 * @author Openwebinars
 *
 */
public class EjemploFechas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Obtenemos la fecha de hoy con now
		LocalDate today = LocalDate.now();
		
		// Obtenemos una fecha cualquiera con el m�todo of(...)
		LocalDate otraFecha = LocalDate.of(2017, 12, 24);
		
		// Comprobamos si una fecha es anterior a otra
		if (otraFecha.isAfter(today)) {
			System.out.println("La otra fecha es posterior a la de hoy");
		}
		
		// Obtenemos la fecha de ayer, restando un d�a a la de hoy
		LocalDate ayer = today.minus(1, ChronoUnit.DAYS);
		if (ayer.isBefore(today)) {
			System.out.println("Ayer es anterior a hoy");
		}
		
		// Es el a�o actual bisiesto?
		System.out.println("El a�o actual " + (LocalDate.now().isLeapYear() ? "s�" : "no") + " es bisiesto");
		
		// Imprimimos el valor de otraFecha con su transformaci�n por defecto
		System.out.println(otraFecha);
		
		// Ahora, lo imprimimos formateando la misma a un formato LARGO
		System.out.println(otraFecha.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
		
		// Por �ltimo, imprimimos la fecha de hoy en un formato proporcionado en una cadena
		System.out.println(otraFecha.format(DateTimeFormatter.ofPattern("dd/MM/yy")));

	}

}
