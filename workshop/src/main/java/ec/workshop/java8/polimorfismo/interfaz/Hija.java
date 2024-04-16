/**
 * Interfaz Hija (que extiende a Base)
 */

package ec.workshop.java8.polimorfismo.interfaz;


/**
 * @author Openwebinars
 *
 */
public interface Hija extends Base {
	
	default public void saludar(String s) {
		System.out.println(s + " desde Hija");
	}

}
