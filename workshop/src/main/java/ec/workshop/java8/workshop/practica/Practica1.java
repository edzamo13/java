package ec.workshop.java8.workshop.practica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practica1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {

		List<String> documets = new ArrayList<>();
		Scanner scanner;

		scanner = new Scanner(
				new File("/Users/ezamora/Documents/Personal/Curso/openwebinars/Java8/javadeveloper/standalone.xml"));
		while (scanner.hasNext()) {
			documets.add((String) scanner.next());
		}
		documets.forEach(x -> System.out.println(x));

		/* contar el total de lineas */
		System.out.println(documets.stream().count());
		/* contar cuantos veces se repite module */
		System.out.println(documets.stream().filter(cad -> cad.contains("module")).count());
		System.out.println("++++++++++++++++++++++++++++++++++++***************++++++++++++++++++++");
		/* Remplazar la palabra module por apellido */
		documets.stream().filter(cad -> cad.contains("module")).map(x -> x.replace("module", "ezamora"))
				.forEach(System.out::println);
		/* contar los caracteres */

	

	}

}
