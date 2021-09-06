/**
 * 
 */
package apistream;

import java.util.Arrays;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class D_Foreach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> capitales = Arrays.asList("Ja�n", "C�rdoba", "Sevilla", "Huelva", "C�diz", "M�laga", "Granada",
				"Almer�a");

		// Obtenemos un stream con todas las capitales de Andaluc�a que empiezan por C
		System.out.println("CAPITALES DE ANDALUC�A QUE EMPIEZAN POR C");
		capitales.stream().filter(s -> s.startsWith("C")).forEachOrdered(System.out::println);
		System.out.println("");

		System.out.println("ALGUNAS CAPITALES DE ANDALUC�A SIN REPETIR");
		List<String> capitalesRepetidas = Arrays.asList("Sevilla", "Huelva", "Sevilla");
		// Obtenemos un stream con todas las capitales sin repetir.
		capitalesRepetidas.stream().distinct().forEach(System.out::println);
		System.out.println();

		// Obtenemos un stream cuyo tama�o no es mayor que un n�mero
		System.out.println("LAS 5 PRIMERAS CAPITALES DE ANDALUC�A");
		capitales.stream().limit(5).forEachOrdered(System.out::println);
		System.out.println("");

		// Obtenemos un stream que descarta una serie de elementos iniciales
		System.out.println("LAS �LTIMAS CAPITALES DE ANDALUC�A");
		capitales.stream().skip(4).forEach(System.out::println);
		System.out.println("");

		// Obtenemos todas las capitales en may�sculas
		System.out.println("LAS CAPITALES DE ANDALUC�A EN MAY�SCULA");
		capitales.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("");

		// Obtenemos las longitudes en caracteres de todas las capitales
		System.out.println("LA LONGITUD EN CARACTERES DE TODAS LAS CAPITALES DE ANDALUC�A");
		capitales.stream().mapToInt(String::length).forEach(System.out::println);
		System.out.println();

		// Obtenemos las longitudes en caracteres de todas las capitales
		// en un formato m�s adecuado
		System.out.println("LA LONGITUD EN CARACTERES DE TODAS LAS CAPITALES DE ANDALUC�A");
		capitales.stream().
		map(s -> String.format("%s (%d caracteres)", s, s.length())).
		forEach(System.out::println);

	}

}
