/**
 * En este ejemplo podemos ver el uso de clase internas est�ticas,
 * que permiten crear instancias de ellas sin crear una instancia
 * de la clase que la envuelve.
 */
package ec.workshop.java8.examplestatic.clasestatic;

/**
 * @author Openwebinars
 *
 */
public class EjemploClaseStatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona p = new Persona("Pepe");		
		System.out.println(p);
		
		//Trabajaremos esto en profundidad en cap�tulos posteriores
		OtraClase o = new EjemploClaseStatic().new OtraClase("Juan");
		System.out.println(o);
	}
	
	public static class Persona {
		
		private String nombre;
		
		public Persona(String nombre) {
			this.nombre = nombre;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		@Override
		public String toString() {
			return "Persona [" + (nombre != null ? "nombre=" + nombre : "") + "]";
		}
		
		
		
	}
	
	public class OtraClase {
		
		private String atributo;
		
		public OtraClase(String atributo) {
			this.atributo = atributo;
		}

		@Override
		public String toString() {
			return "OtraClase [" + (atributo != null ? "atributo=" + atributo : "") + "]";
		}
		
		
	}

}
