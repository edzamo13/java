/**
 * 
 */
package ec.workshop.java8.basic.excepciones;

/**
 * @author Openwebinars
 *
 */
public class TratamientoExcepciones04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//String[] mensajes = { "En un lugar", "de La Mancha", "de cuyo nombre", "no quiero acordarme" };
		String[] mensajes = { "En un lugar", null, "de cuyo nombre", "no quiero acordarme", "no ha mucho tiempo viv�a" };

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(mensajes[i].toUpperCase());
			}
		} catch (ArrayIndexOutOfBoundsException | NullPointerException ex) {
			System.err.println("Tratamiento com�n a las excepciones");
		}
		
		System.out.println("Mensaje final");

	}

}
