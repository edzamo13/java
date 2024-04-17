/**
 * APLICACI�N QUE IMPLEMENTA LA GESTI�N DE UN PARKING
 */
package ec.workshop.java8.workshop.parking;

import ec.workshop.java8.workshop.parking.modelo.Autobus;
import ec.workshop.java8.workshop.parking.modelo.Furgoneta;
import ec.workshop.java8.workshop.parking.modelo.Parking;
import ec.workshop.java8.workshop.parking.modelo.Vehiculo;
import java.util.Scanner;


/**
 * @author Openwebinars
 *
 */
public class App {

	static Parking parking;

	static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Inicializamos las clases necesarias
		sc = new Scanner(System.in);
		// Ponemos en marcha el Parking.
		parking = new Parking();

		int opcion = 0;

		do {
			// Imprimimos el men�
			menu();
			System.out.print("Introduzca la opci�n seleccionada: ");
			opcion = Integer.parseInt(sc.nextLine());
			System.out.println("");
			switch (opcion) {
			case 1:
				registrarEntradaVehiculo();
				parking.imprimirEstadoParking();
				break;
			case 2:
				registrarSalidaVehiculo();
				parking.imprimirEstadoParking();
				break;
			case 3:
				if (parking.getPlazasDisponibles() > 0) {
					System.out.printf("Hay %d plazas disponibles %n", parking.getPlazasDisponibles());
				} else {
					System.out.println("El parking est� COMPLETO");
				}
				break;
			case 4:
				parking.imprimirEstadoParking();
				break;
			case 5:
				System.out.printf("El saldo acumulado es de %.2f", parking.getSaldoAcumulado());
				break;
			case 6:
				parking.getVehiculos().forEach(System.out::println);
				break;
			default:
				System.out.println("Introduzca una opci�n correcta");
			}
			
		

		} while (opcion != 0);

		sc.close();
	}

	public static void menu() {

		System.out.println("BIENVENIDO AL PARKING OPENWEBINARS");
		System.out.println("==================================\n");
		System.out.println("0. Salir del programa");
		System.out.println("1. Registrar la entrada de un veh�culo");
		System.out.println("2. Registrar la salida de un veh�culo");
		System.out.println("3. N�mero de plazas disponibles");
		System.out.println("4. Imprimir estado del parking");
		System.out.println("5. Saldo acumulado del d�a");
		System.out.println("6. Imprimir la lista de vehiculos que hay en el parking");

	}

	public static void registrarEntradaVehiculo() {
		// Identificamos el tipo de veh�culo
		int opcion = 0;
		do {
			System.out.println("1. Coche o moto");
			System.out.println("2. Furgoneta");
			System.out.println("3. Autob�s");
			System.out.print("Introduzca el tipo de veh�culo: ");

			opcion = Integer.parseInt(sc.nextLine());
		} while (opcion < 0 || opcion > 3);

		// Recogemos los datos propios de cualquier veh�culo
		System.out.print("Introduzca la marca del veh�culo: ");
		String marca = sc.nextLine();
		System.out.print("Introduzca la matr�cula del veh�culo: ");
		String matricula = sc.nextLine();

		Vehiculo v = null;

		// En funci�n del tipo de veh�culo, creamos una u otra referencia
		switch (opcion) {
		case 1:
			//Almacenamos los datos en may�sculas
			v = new Vehiculo(matricula.toUpperCase(), marca.toUpperCase());
			break;
		case 2:
			// Si es una furgoneta, solicitamos la longitud
			System.out.print("Introduzca la longitud en metros de la furgoneta (puede incluir decimales): ");
			float longitud = Float.parseFloat(sc.nextLine());
			v = new Furgoneta(matricula, marca, longitud);
			break;
		case 3:
			// Si es un autob�s, solicitamos el n�mero de plazas
			System.out.print("Introduzca el n�mero de plazas del autob�s: ");
			int numPlazas = Integer.parseInt(sc.nextLine());
			v = new Autobus(matricula, marca, numPlazas);
		}

		// Registramos la entrada del veh�culo
		parking.registrarEntradaVehiculo(v);
		System.out.println("");
	}
	
	public static void registrarSalidaVehiculo() {
		System.out.print("\nIntroduzca la matr�cula del veh�culo: ");
		String matricula = sc.nextLine();
		// Para registrar la salida de un veh�culo solamente
		// necesitamos su matr�cula
		parking.registrarSalidaVehiculo(new Vehiculo(matricula.toUpperCase()));
	}

}
