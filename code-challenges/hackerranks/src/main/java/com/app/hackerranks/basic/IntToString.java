package com.app.hackerranks.basic;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int in = scanner.nextInt();
		if (-100 < in && in < 100) 
			System.out.println("Good job");
		

			scanner.close();
	}

}
