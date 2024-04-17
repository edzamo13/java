/**
 * 
 */
package ec.workshop.java8.basic.arrays.objetos;

import java.util.Random;

/**
 * @author Openwebinars
 *
 */
public class ManejoArrays03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Estos dos arrays nos permitir�n obtener valores aleatorios para inicializar los datos
		String[] nombres = {"Jos�", "Antonio", "Mart�n", "Luis", "Mar�a", "Leticia", "Luisa"};
		String[] apellidos = {"P�rez", "G�mez", "L�pez", "Garc�a", "Mu�oz", "Mart�nez"};
		
		//Creamos nuestro array de 5 elementos de tipo Persona
		Persona[] personas = new Persona[5];
		
		//Inicializamos los valores
		for(int i = 0; i < personas.length; i++) {
			//Obtenemos un nombre de una posici�n aleatoria
			String nombre = nombres[aleatorio(nombres.length)];
			//Obtenemos un apellido de una posici�n aleatoria			
			String apellido = apellidos[aleatorio(nombres.length)];
			//Los usamos para crear una nueva persona
			personas[i]= new Persona(nombre, apellido);
		}
		
		//Recorremos de nuevo el array, esta vez
		//para imprimir sus valores.
		for(Persona p : personas) {
			System.out.println(p);
		}

	}

	/*
	 * ESTE M�TODO DEVUELVE UN N�MERO ALEATORIO ENTRE
	 * 0 y TOPE-1.
	 */
	public static int aleatorio(int tope) {
		Random r = new Random();		
		return r.nextInt(tope-1);
	}

}
