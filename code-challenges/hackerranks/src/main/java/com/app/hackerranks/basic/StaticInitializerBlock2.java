package com.app.hackerranks.basic;

import java.util.Scanner;

public class StaticInitializerBlock2 {


	

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		int H = sc.nextInt();
		if (flag(B,H)) {
			int area = B * H;
			System.out.print(area);
		}

	}
	


	private static boolean flag(int b,int h) {
		if (b > 0 && h > 0) {
			return true;
		} else {
			System.out.print("java.lang.Exception: Breadth and height must be positive");
			return false;
		}

	}

}
