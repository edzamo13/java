package com.app.hackerranks.basic.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopsII {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		List<String> data = new ArrayList<>();
		List<String> result = new ArrayList<>();
		int a = 0;
		int b = 0;
		int n = 0;
		int cont = 0;
		while (cont <= t) {
			cont++;
			data.add(in.nextLine());
		}
		data.remove("");
		in.close();
		for (String d : data) {
			String[] newStr = d.split("\\s+");
			a = Integer.parseInt(newStr[0]);
			b = Integer.parseInt(newStr[1]);
			n = Integer.parseInt(newStr[2]);
			result.add(makeSeries(a, b, n));

		}
		result.forEach(System.out::println);

	}

	private static String makeSeries(int a, int b, int n) {
		List<String> resul = new ArrayList<>();
		int serie = 0;
		for (int i = 0; i < n; i++) {
			serie = serie + ((int) (Math.pow(2, i) * b));
			resul.add(String.valueOf((serie + a)) + " ");
		}
		String cad = "";
		for (String r : resul) {
			cad = cad + r;
		}
		return cad;
	}
}
