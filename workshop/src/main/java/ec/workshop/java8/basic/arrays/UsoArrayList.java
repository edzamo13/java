/**
 * PROGRAMA DE EJEMPLO DE USO DE LA CLASE ARRAYLIST, QUE SIMULA UNA SENCILLA AGENDA DE CONTACTOS
 */
package ec.workshop.java8.basic.arrays;

import ec.workshop.java8.basic.objetos.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Openwebinars
 *
 */
public class UsoArrayList {

	/**
	 * @param args
	 */

	//Declaramos estas dos referencias como est�ticas, para poder usarlas en todos los m�todos
	static Scanner sc;
	static ArrayList<Persona> listaPersonas;

	public static void main(String[] args) {

		//Inicializamos la lista y la lectura por teclado
		listaPersonas = new ArrayList<>();
		sc = new Scanner(System.in);
		int opcion;

		do {
			//Al inicio de cada iteraci�n mostramos el men�, y recogemos la opci�n
			menu();
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				listarPersonas();
				break;
			case 2:
				aniadirPersona();
				break;
			case 3:
				eliminarPersona();
				break;
			case 4:
				eliminarTodas();
				break;

			default:
				System.out.println("Opci�n no v�lida. Introduzca una opci�n v�lida, por favor.");
			}

		} while (opcion != 0);
		
		sc.close();

	}

	/*
	 * M�TODO QUE IMPRIME EL MEN�
	 */
	public static void menu() {
		System.out.println("AGENDA DE CONTACTOS");
		System.out.println("===================");
		System.out.println("1. Listar todos los contactos");
		System.out.println("2. A�adir un contacto");
		System.out.println("3. Eliminar un contacto");
		System.out.println("4. Eliminar todos los contactos");
		System.out.println("0. Salir del programa\n\n");
		System.out.print("Introduzca una opci�n: ");

	}

	/*
	 * M�TODO QUE LISTA TODOS LOS CONTACTOS DE LA AGENDA
	 * O MUESTRA UN MENSAJE SI NO HAY NINGUNO QUE MOSTRAR
	 */
	public static void listarPersonas() {
		if (listaPersonas.isEmpty()) {
			System.out.println("La agenda no tiene contactos\n");
		} else {
			for (int i = 0; i < listaPersonas.size(); i++) {
				Persona p = listaPersonas.get(i);
				System.out.printf("%d %s %s (%s) %n", i, p.getNombre(), p.getApellidos(), p.getTelefono());
			}
			System.out.println("");
		}
	}

	/*
	 * M�TODO QUE RECOGE LOS DATOS DEL USUARIO
	 * PARA A�ADIR UNA NUEVA PERSONA, Y LA INSERTA EN LA LISTA
	 */
	public static void aniadirPersona() {
		System.out.println("\n\nA�ADIR NUEVO CONTACTO");
		System.out.print("Introduzca el nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Introduzca los apellidos: ");
		String apellidos = sc.nextLine();
		System.out.print("Introduzca su n�mero de tel�fono: ");
		String telefono = sc.nextLine();

		listaPersonas.add(new Persona(nombre, apellidos, telefono));
		
		System.out.println("");
		
	}

	/*
	 * M�TODO QUE ELIMINA UNA PERSONA DE LA AGENDA
	 * EN FUNCI�N DE UNA POSICI�N RECOGIDA DEL TECLADO
	 */
	public static void eliminarPersona() {
		System.out.println("\n\nELIMINAR CONTACTO");
		System.out.print("Introduzca la posici�n del contacto: ");
		int posicion = Integer.parseInt(sc.nextLine());
		if (posicion < 0 || posicion >= listaPersonas.size()) {
			System.out.println("Posici�n erronea");
		} else {
			System.out.print("�Est� usted seguro de querer eliminar el contacto? (S/N): ");
			String siono = sc.nextLine();
			if (siono.equalsIgnoreCase("S")) {
				listaPersonas.remove(posicion);
			}
		}
		System.out.println("");


	}

	/*
	 * M�TODO QUE ELIMINA TODOS LOS CONTACTOS DE LA AGENDA
	 * PREVIA CONFIRMACI�N DE LA OPERACI�N
	 */
	public static void eliminarTodas() {
		System.out.println("\n\nELIMINAR CONTACTO");
		System.out.print("�Est� usted seguro de querer eliminar el contacto? (S/N): ");
		String siono = sc.nextLine();
		if (siono.equalsIgnoreCase("S")) {
			listaPersonas.clear();
		}
		System.out.println("");

	}

}
