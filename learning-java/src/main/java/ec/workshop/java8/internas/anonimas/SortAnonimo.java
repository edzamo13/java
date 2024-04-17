/**
 * OTRO EJEMPLO DE CLASE AN�NIMA, PARA MODIFICAR EL ORDEN NATURAL DE LOS N�MEROS
 */
package ec.workshop.java8.internas.anonimas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class SortAnonimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		//Orden inverso a trav�s de una clase an�nima
		listaNumeros.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				return -arg0.compareTo(arg1);
			}
			
		});

		for(Integer i : listaNumeros)
			System.out.print(i + " ");
		
	}

}
