/**
 * DIFERENTES TIPOS DE EJEMPLO DE VARIABLE FINAL
 */
package ec.workshop.java8.examplefinal.ejemplovariablefinal;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class EjemploVariablesFinal {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Referencias final
		final Persona p = new Persona("12345678A", "Pepe", "Perez", Persona.HOMBRE, LocalDate.of(1950, 1, 1));
		System.out.println(p);
		p.setNombre("Jos�");
		System.out.println(p);
		
		//No nos permite realizar esta reasignaci�n del objeto
		//p = new Persona("23456789B", "Ana", "Mart�nez", Persona.MUJER, LocalDate.of(1960, 2, 2));
		
		//Arrays final
		final Persona[] matrimonio1 = new Persona[2];
		Persona[] matrimonio2 = new Persona[2];
		
		matrimonio1[0] = p;
		
		//Tampoco nos deja hacer esta asignaci�n
		//matrimonio1 = matrimonio2;
		
		//Podemos referencia a un objeto referenciado como final,
		//desde una referencia que no es final
		Persona p2 = p;		
		System.out.println(p2);
		
		//Esta referencia NO final s� que puede ser reasignada
		p2 = new Persona("23456789B", "Ana", "Mart�nez", Persona.MUJER, LocalDate.of(1960, 2, 2));
		System.out.println(p2);
		
	}
	

	public static Persona metodoConParametroFinal(final Persona p) {
		//No nos permite realizar esta reasignaci�n del objeto
		//p = new Persona("23456789B", "Ana", "Mart�nez", Persona.MUJER, LocalDate.of(1960, 2, 2));
		return p;
	}

}
