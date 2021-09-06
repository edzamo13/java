/**
 * EJEMPLO DE USO DE UNA CLASE GEN�RICA
 */
package ejemplobasico;

/**
 * @author Openwebinars
 *
 */
public class EjemploPar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Par<Integer, String> pareja1 = new Par<>(1, "UNO");
		
		System.out.println("imprimir:" + pareja1);
		
		//pareja1.setObj1("UNO"); //Error de compilaci�n
		
		Par<String, String> pareja2 = new Par<>("Hola", "Mundo");
		
		System.out.println(pareja2);

	}

}
