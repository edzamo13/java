/**
 * 
 */
package ec.workshop.java8.basic.handlethrows.misexcepciones;

/**
 * @author Openwebinars
 *
 */
public class Banco {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		misexcepciones.CuentaCorriente cc = new misexcepciones.CuentaCorriente("Luis Miguel", 100.0);
		
		try {
			cc.sacarDinero(160.0);
			System.out.println("Saldo actual " + cc.getSaldo());
		} catch (misexcepciones.SaldoNegativoException e) {
			System.err.println(e.getMessage());
			System.err.println("P�ngase en contacto con su banco");
		}
		

	}

}
