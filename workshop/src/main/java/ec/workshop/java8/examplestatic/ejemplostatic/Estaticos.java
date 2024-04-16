/**
 * Ejemplo de uso de atributos y m�todos est�ticos
 */
package ec.workshop.java8.examplestatic.ejemplostatic;

/**
 * @author Openwebinars
 *
 */
public class Estaticos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Bicicleta bici1 = new Bicicleta(21, 27, 0);
		Bicicleta bici2 = new Bicicleta(18, 24, 0);
		
		System.out.println(bici1.getId());
		System.out.println(bici2.getId());
		
		System.out.println("N�mero total de bicis: " + Bicicleta.getNumeroDeBicicletas());

	}

}
