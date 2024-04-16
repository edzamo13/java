/**
 * 
 */
package ec.workshop.java8.apistream.claculateordenation;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Openwebinars
 *
 */
public class C_Ordenacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// Los streams derivados para tipos enteros, double o long
		// tienen un m�todo de ordenaci�n con el orden natural
		int[] array = generarArrayAleatorio();				
		
		System.out.println("ARRAY SIN ORDENAR");
		System.out.println(Arrays.toString(array));
		
		int[] arrayOrdenado = Arrays.stream(array).sorted().toArray();
		
		System.out.println("ARRAY ORDENADO");
		System.out.println(Arrays.toString(arrayOrdenado));
		
		
		// En el caso de las clases, podemos aportar una 
		// instancia de Comparator
		List<String> capitales = Arrays.asList("Ja�n", "C�rdoba", "Sevilla", "Huelva", "C�diz", "M�laga", "Granada",
				"Almer�a");
		//Ordenamos las capitales por orden alfab�tico inverso
		capitales.stream().sorted((s1, s2) -> -s1.compareTo(s2)).forEach(System.out::println);

	}
	
	public static int[] generarArrayAleatorio() {
		return new Random().ints(100, 0, 1000).toArray();
	}

}
