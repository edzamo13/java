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
public class B_Datos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double array[] = generarArrayAleatorio();

		// Conocemos el array
		System.out.println(Arrays.toString(array));

		System.out.println("El n�mero de elementos del stream: " + Arrays.stream(array).count());

		// C�lculo del m�ximo y m�nimo
		double maximo = Arrays.stream(array).max().orElse(0);
		double minimo = Arrays.stream(array).min().orElse(0);

		System.out.printf("El valor m�ximo es %.2f y el m�nimo %.2f%n", maximo, minimo);

		double suma = Arrays.stream(array).sum();
		System.out.println("La suma de todos los elementos del array es: " + suma);

		// Uso del c�lculo del m�ximo y m�nimo en otro tipo de clases
		List<String> listaPalabrasLargas = Arrays.asList("Arteriosclerosis", "Bioelectromagnetismo", "Ciclopentanoperhidrofenantreno",
				"Magnetoencefalograf�a", "Neurorretroalimentaci�n");
		
		String palabraMaxima = listaPalabrasLargas.stream().max((s1, s2) -> s1.length()-s2.length()).get();
		
		System.out.println("La palabra m�s larga de la lista es " + palabraMaxima);

	}

	public static double[] generarArrayAleatorio() {
		return new Random().doubles(100, 0, 1000).toArray();
	}

}
