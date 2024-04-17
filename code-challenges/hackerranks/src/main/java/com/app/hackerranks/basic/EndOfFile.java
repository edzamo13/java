package com.app.hackerranks.basic;

import java.util.Scanner;

public class EndOfFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int cont = 1;
		System.out.println("");
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			System.out.println(cont + " " + string);
			cont++;
		}
	}

}
