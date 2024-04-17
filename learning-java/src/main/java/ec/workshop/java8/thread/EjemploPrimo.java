/**
 * EJEMPLO DE EJECUCI�N DE LA CLASE PRIMOTHREAD
 */
package ec.workshop.java8.thread;

/**
 * @author Openwebinars
 *
 */
public class EjemploPrimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PrimoThread pt = new PrimoThread(135);
		pt.start();		
		System.out.println("Este mensaje se imprime pronto");

	}

}
