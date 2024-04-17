/**
 * 
 */
package ec.workshop.java8.runnable.ejemplorunnable;

/**
 * @author Openwebinars
 *
 */
public class EjemploRunnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creaci�n y lanzamiento de PrimoRunnable
		//a trav�s de un thread.
		Thread t = new Thread(new PrimoRunnable(12345));
		t.start();
		
		//Otra forma de hacerlo, a trav�s de una 
		//instancia an�nima
		new Thread(new PrimoRunnable(1234567)).start();

	}

}
