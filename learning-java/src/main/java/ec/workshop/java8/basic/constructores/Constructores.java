/**
 * 
 */
package constructores;

import ec.workshop.java8.basic.objetos.Persona;

/**
 * @author Openwebinars
 *
 */
public class Constructores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona johndoe = new Persona();
		johndoe.presentacion();
		
		Persona manuel = new Persona("Manuel", "Ruiz Gonz�lez");		
		manuel.presentacion();
		
		Persona antonio = new Persona("Antonio", "Castillo Real", 31);
		antonio.presentacion();

	}

}
