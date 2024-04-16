/**
 * ESTA CLASE IMPRIME POR CONSOLA UN N�MERO PRIMO MAYOR QUE EL N�MERO
 * QUE SE LE HA PROPORCIONADO A TRAV�S DEL CONSTRUCTOR
 */
package ec.workshop.java8.thread;

/**
 * @author Openwebinars
 *
 */

public class PrimoThread extends Thread {

	private long minimo;
	
	public PrimoThread(long minimo) {
		this.minimo = minimo;
	}
	
	
	
	@Override
	public void run() {
		long n = minimo;
		while(!testPrimalidad(n)) {
			System.out.printf("(M�nimo: %d) %d no es primo %n", minimo, n);
			++n;
		}
		
		System.out.printf("El n�mero primo es %d %n", n);
	}
	
	


	/*
	 * M�todo que nos permite verificar si un n�mero es
	 * primo revisando si tiene divisores hasta n/2
	 * OJO es f�cil de implementar, pero ineficiente para 
	 * n�meros grandes
	 */
	public static boolean testPrimalidad(long n) {
		
		boolean continuar = true;
		boolean esPrimo = true;
		long divisor = 2;
		do {
			if (n % divisor == 0) {
				continuar = false;
				esPrimo = false;
			} else
				++divisor;			
				
		} while (continuar && divisor <= (n/2));
		
		return esPrimo;
	}

}
