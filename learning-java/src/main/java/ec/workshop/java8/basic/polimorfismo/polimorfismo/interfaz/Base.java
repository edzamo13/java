/**
 *  Interfaz Base (para la herencia)
 */
package ec.workshop.java8.basic.polimorfismo.polimorfismo.interfaz;

/**
 * @author Openwebinars
 *
 */
public interface Base {
	
	default public void saludar(String mensaje) {
		System.out.println(mensaje + " desde Base");
	}

}
