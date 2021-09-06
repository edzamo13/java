/**
 * 
 */
package apistream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Openwebinars
 *
 */
public class EjemploBusqueda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> capitales = Arrays.asList("Ja�n", "C�rdoba", "Sevilla", "Huelva", "C�diz", "M�laga", "Granada",
				"Almer�a");

		// Verificamos si TODOS los elementos cumplen una condici�n
		// En particular, que la longitud de la cadena de caracteres sea mayor o igual que 4.
//		boolean longitud = capitales.stream().allMatch(s -> s.length() >= 4);
//
//		String mensajeLongitud = (longitud) ? "Todas las capitales tienen 4 o m�s caracteres"
//				: "Hay alguna capital con menos de 4 caracteres";
//
//		System.out.println(mensajeLongitud);
//		
//		System.out.println("");
		
		
		// Verificamos si ALGUNO de los elementos cumple con una condici�n
//		boolean jaen = capitales.stream().anyMatch((s) -> s.equalsIgnoreCase("ja�n"));
//		
//		String mensajeJaen = (jaen) ? "Ja�n est� en la lista de capitales" : "Ja�n no est� en la lista de capitales";
//		
//		System.out.println(mensajeJaen);
//		
//		System.out.println("");
//		
//		
//		// La inversa de allMatch es noneMatch
//		boolean noneMatchLongitud = capitales.stream().noneMatch(s -> s.length() >= 4);
//
//		String mensajenoneMatchLongitud = (noneMatchLongitud) ? "Todas las capitales tienen menos de 4 caracteres"
//				: "Hay alguna capital con 4 caracteres o m�s";
//
//		System.out.println(mensajenoneMatchLongitud);
//		
//		System.out.println("");
//		
//		
//		// Localiza alg�n elemento (cualquiera) del Stream. Recomendado para streams paralelos
		Optional<String> unaCapital = capitales.parallelStream().findAny();
		System.out.println(unaCapital.orElse("No quedan capitales en el Stream"));
		System.out.println("");
//		// Localiza el primer elemento del Stream. NO RECOMENDADO para streams paralelos
		Optional<String> primeraCapital = capitales.stream().findFirst();
		System.out.println(primeraCapital.orElse("No quedan capitales en el Stream"));
		System.out.println("");

		
		
	}

}
