/**
 * EJEMPLO DE USO DE CLASES Y M�TODOS ABSTRACTOS
 */
package ec.workshop.java8.exampleabstract.ejemploabstractinterfaces;

/**
 * @author Openwebinars
 *
 */
public class EjemploAbstract {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Imposible instanciar la clase abstracta
		//ObjectoGrafico o = new ObjetoGrafico();
		
		Circulo c = new Circulo(1,1,7);
		c.dibujar();
		c.cambiarTamanio(2);
		c.moverA(3, 3);
		c.dibujar();
		
		//Podemos usar el Circulo con una referencia
		//de tipo ObjetoGrafico
		ObjectoGrafico o = c;
		System.out.println("Dibujando un c�rculo desde un objeto gr�fico");
		o.dibujar();
		
		

	}

}
