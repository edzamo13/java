package ec.workshop.java8.apistream.lambda;

import java.util.Comparator;

public class MayorAMenor implements Comparator<Integer> {

	
	/*
	 * ESTE M�TODO SOBREESCRIBE EL "ORDEN NATURAL"
	 * DE LOS N�MEROS DE FORMA QUE:
	 * 
	 * - Si el primer n�mero es menor que el segundo, devuelve un valor positivo.
	 * - Si son iguales devuelve un cero.
	 * - Si el primer n�mero es mayor que el segundo, devuelve un valor negativo.  
	 */
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return -(o1.compareTo(o2));
	}
	
	

}
