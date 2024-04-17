/**
 * Ejemplo m�s complejo que nos permite utilizar
 * 
 *  - Variables num�ricas
 *  - Operadores
 *  - Expresiones
 *  - Estructuras de decisi�n
 *  - Estructuras de repetici�n
 * 
 */
package ec.workshop.java8.basic.workshop;

import java.util.Scanner;

/**
 * @author Openwebinars
 *
 */
public class Calculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variable donde almacenamos el valor seleccionado
		//del men�
		int opcion = 0;
		//Por ahora, es normal si no se comprenden estas dos
		//l�neas de c�digo.
		Scanner sc;
		sc = new Scanner(System.in);
		
		do {

			//Imprimimos por consola el men�
			System.out.println("\n"); //Este caracter especial nos permite imprimir una l�nea en blanco
			System.out.println("***** CALCULADORA OPENWEBINARS *****");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Resto");
			System.out.println("0. Salir del programa");
			System.out.print("Introduzca una opci�n v�lida: ");
			
			//Estas l�neas de c�digo nos permiten leer del teclado
			//y transformar el valor le�do de String a int
			
			// 1) Recoger el valor escrito en el teclado
			// 2) Transformar esa cadena de caracteres en un valor entero
			opcion = Integer.parseInt(sc.nextLine());
			
			//Si la opcion es menor que 0 o mayor que 5, no es una
			//opci�n v�lida
			if (opcion < 0 || opcion > 5) {
				System.out.println("Opci�n no v�lida. Vuelva a escoger");
				//Si la opcion es diferente a cero, solicitamos los 
				//dos operandos
			} else if (opcion != 0) {

				System.out.println("\n");
				
				float operando1, operando2;
				
				System.out.print("Introduzca el primer operando: ");
				operando1 = Float.parseFloat(sc.nextLine());
				
				System.out.print("Introduzca el segundo operando: ");
				operando2 = Float.parseFloat(sc.nextLine());

				
				System.out.println("\n");
				switch(opcion) {
				
				case 1: //Suma
					System.out.println("El resultado de la suma es " + (operando1 + operando2));
					break;
				case 2: //Resta
					System.out.println("El resultado de la resta es " + (operando1 - operando2));
					break;
				case 3: //Multiplicaci�n
					System.out.println("El resultado de la multiplicaci�n es " + (operando1 * operando2));
					break;
				case 4: //Divisi�n
					System.out.println("El resultado de la divisi�n es " + (operando1 / operando2));
					break;
				case 5: //Resto
					System.out.println("El resto de dividir " +operando1 + " entre " + operando2 + " es "+ (operando1 % operando2));
					break;
					
				}
				
			}
			
		} while (opcion != 0); //opcion == 0 implicar salir del programa
		
		//Indicamos que no vamos a leer ning�n valor m�s por teclado.
		sc.close();
		
		System.out.println("Finalizando la ejecuci�n de la calculadora");

	}

}
