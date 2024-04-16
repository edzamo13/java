/*
 * Ejemplo de clase abstracta
 */
package ec.workshop.java8.exampleabstract.ejemploabstract;


/**
 * @author Openwebinars
 *
 */
public abstract class ObjectoGrafico  {
	
	protected int x, y;
	
	public void moverA(int nuevaX, int nuevaY) {
		this.x = nuevaX;
		this.y = nuevaY;
	}
	
	abstract public void dibujar();
	
	abstract public void cambiarTamanio(int factorAumento);

}
