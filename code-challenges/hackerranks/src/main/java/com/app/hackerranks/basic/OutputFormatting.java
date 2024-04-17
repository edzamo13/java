package com.app.hackerranks.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OutputFormatting {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> outStrings = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			String firstString = sc.next();
			String secondString = sc.next();
			if (secondString.length() == 2) {
				secondString = "0".concat(secondString);
			} else if (secondString.length() == 1) {
				secondString = "00".concat(secondString);
			}
			String newFormatt = String.format("%-15s", firstString);
			newFormatt = newFormatt.concat(secondString);

			outStrings.add(newFormatt);
			newFormatt = "";

		}
		System.out.println("================================");
		outStrings.forEach(System.out::println);
		System.out.println("================================");

	}
}
