/**
 * 
 */
package ec.workshop.java8.fuctionalpredicateconsumerSupplier.function;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author Openwebinars
 *
 */
public class EjemploFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Function<Persona, String> functionPersonaANombre = (Persona p) -> { return p.getNombre(); };
		
		List<Persona> lista = Arrays.asList(
				new Persona("12345678A", "Pepe", "P�rez P�rez", LocalDate.of(1990, 1, 1)),
				new Persona("12345678A", "Mar�a", "L�pez Almagro", LocalDate.of(1996, 4, 21)),
				new Persona("12345678A", "Mart�n", "Casillas Cuenca", LocalDate.of(1991, 12, 12))				
				);
		
		List<String> listaNombres = transformarEmpleadosEnNombres(lista, functionPersonaANombre);
		
//		for(String s: listaNombres)
//			System.out.println(s);
//		System.out.println(" ");

		//Como expresi�n lambda
		lista
			.stream()
			.map((p) -> p.getNombre())
			.forEach(System.out::println);
		
		

	}

	private static List<String> transformarEmpleadosEnNombres(List<Persona> lista,
			Function<Persona, String> functionPersonaANombre) {
		List<String> result = new ArrayList<>();
		for(Persona p : lista)
			result.add(functionPersonaANombre.apply(p));
		
		return result;
	}

}
