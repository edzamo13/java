/**
 * 
 */
package ec.workshop.java8.runnable.ejemplorunnableanonimo;

/**
 * @author Openwebinars
 *
 */
public class EjemploRunnableAnonimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Este trozo de c�digo puede ser muy com�n si
		//el proceso de lanzamiento del hilo est� dentro
		//de un manejador de eventos, como el click de un
		//bot�n.
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello from Runnable+Thread!!");
				
			}
			
		}).start();
		
		//Este c�digo es como el anterior, pero aprovecha la potencia
		//de las expresiones lambda.
		new Thread(() -> System.out.print("Hello from Lambda Runnable+Thread")).start();

	}

}
