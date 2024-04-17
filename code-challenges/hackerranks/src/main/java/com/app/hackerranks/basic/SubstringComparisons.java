package com.app.hackerranks.basic;

import java.util.Scanner;

public class SubstringComparisons {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String cad = scanner.nextLine();
		int amount = scanner.nextInt();
		System.out.println(getSmallestAndLargest(cad, amount));

	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		String[] list = new String[s.length() - k + 1];
		for (int i = 0; i <= s.length() - k; i++) {
			String str = s.substring(i, i + k);
			list[i] = str;
		}

		smallest = list[0];
		largest = list[0];
		for (int i = 1; i < list.length; i++) {
			if (list[i].compareTo(smallest) < 0) {
				smallest = list[i];
			}

			if (list[i].compareTo(largest) > 0) {
				largest = list[i];
			}
		}

		return smallest + "\n" + largest;
	}

}
