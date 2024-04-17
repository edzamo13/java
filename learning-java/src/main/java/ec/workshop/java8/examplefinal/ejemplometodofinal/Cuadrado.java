/**
 * 
 */
package ec.workshop.java8.examplefinal.ejemplometodofinal;

/**
 * @author Openwebinars
 *
 */
public class Cuadrado extends Rectangulo{

	public Cuadrado(float lado) {
		super(lado, lado);
	}
	
	public float getLado() {
		return getBase();
	}
	
	public void setLado(float lado) {
		setBase(lado);
		setAltura(lado);
	}

	//Este m�todo no puede ser sobrescrito
//	public float getArea() {
//		System.out.println("Area de un cuadrado");
//		return getBase()*getBase();
//	}
	
	public float getPerimetro() {
		System.out.println("Perimetro de un cuadrado");
		return getBase()*4;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + getLado() + "]";
	}
	
	

}
