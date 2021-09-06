/**
 * 
 */
package apistream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Openwebinars
 *
 */
public class B_EjemploOperacionesFiltradoStreams {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<String> capitales = Arrays.asList("Ja�n", "C�rdoba", "Sevilla", "Huelva", "C�diz", "M�laga", "Granada",
				"Almer�a");

		// Obtenemos un stream con todas las capitales de Andaluc�a que empiezan por C
		Stream<String> capitalesConC = capitales.stream().filter(s -> s.startsWith("C"));

		List<String> capitalesRepetidas = Arrays.asList("Sevilla", "Huelva", "Sevilla");
		// Obtenemos un stream con todas las capitales sin repetir.
		Stream<String> capitalesSinRepetir = capitalesRepetidas.stream().distinct();

		// Obtenemos un stream cuyo tama�o no es mayor que un n�mero
		Stream<String> primerasCincoCapitales = capitales.stream().limit(5);

		// Obtenemos un stream que descarta una serie de elementos iniciales
		Stream<String> ultimasCuatroCapitales = capitales.stream().skip(4);

	}

}
