/**
 * Definici�n e implementaci�n de una clase
 */
package ec.workshop.java8.basic.objetos;

/**
 * @author Openwebinars
 *
 */
public class Persona {
	
	
	//Estructura, conocida como  propiedades o atributos
	String nombre;
	String apellidos;
	int edad;
	int altura;
	float peso;

	String telefono;

	public Persona() {
	}

	public Persona(String nombre, String apellidos, int edad, int altura, float peso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}

	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public Persona(String nombre, String apellidos, String telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public int getAltura() {
		return altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	//Comportamiento, conocido como m�todos
	void caminar() {
		System.out.println("Estoy caminando");
	}
	
	void hablar() {
		System.out.println("Estoy hablando");
	}
	
	void nacer() {
		System.out.println("���Acabo de nacer!!!");
	}
	
	void morir() {
		System.out.println("�Hasta m�s ver!");
	}
	public void presentacion() {
		System.out.println("�Hasta m�s ver!");
	}
	

}
