/**
 * 
 */
package ec.workshop.java8.examplefinal.ejemplometodofinal;

/**
 * @author Openwebinars
 *
 */
public class Rectangulo {
	
	public float base;
	public float altura;
	
	
	public Rectangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}


	public float getBase() {
		return base;
	}


	public void setBase(float base) {
		this.base = base;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	
	final public float getArea() {
		System.out.println("Area de un rect�ngulo");
		return base*altura;
	}
	
	public float getPerimetro() {
		System.out.println("Per�metro de un rect�ngulo");
		return (base*2) + (altura*2);
	}
	
	

}
