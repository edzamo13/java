/**
 *  PROPIEDADES Y M�TODOS DE UNA CLASE
 */
package ec.workshop.java8.basic;
import ec.workshop.java8.basic.objetos.Persona;

/**
 * @author Openwebinars
 *
 */

public class PropiedadesMetodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.setNombre("Pepe");
		p.setApellidos("Perez");
		p.setAltura(180);
		p.setEdad(25);
		p.setPeso(75.5f);
		
		System.out.println(p);

	}

}
