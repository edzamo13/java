/**
 * 
 */
package ec.workshop.java8.fuctionalinterfaces.conocidos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class EjemploFuncional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> lista = Arrays.asList("En", "un", "lugar", "de", "La", "Mancha");

		Collections.sort(lista, new Comparator<String>() {

			// Ordenamos la cadena por su longitud
			@Override
			public int compare(String str1, String str2) {
			
				System.out.println("str1.length()-str2.length();" + (str1.length() - str2.length()));
				return str1.length() - str2.length();
			}

		});

		// Con lambda
		Collections.sort(lista, (str1, str2) -> str1.length() - str2.length());

		lista.forEach(System.out::println);

	}

}
