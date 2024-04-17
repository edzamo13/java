package com.app.hackerranks.basic;

import java.util.Scanner;

public class StdinAndStdoutII {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String i = scan.nextLine();
		String d = scan.nextLine();
		String s = scan.nextLine();

		// System.out.println(s.toString());

		// Write your code here.

		System.out.println("String: " + s);
		System.out.println("Double: " + Double.parseDouble(d));
		System.out.println("Int: " + i);

	}

}
