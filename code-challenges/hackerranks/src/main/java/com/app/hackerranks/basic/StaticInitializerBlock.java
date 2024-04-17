package com.app.hackerranks.basic;

public class StaticInitializerBlock {

	private static int B = 3;
	private static int H = 1;

	private static boolean flag = initializationBoolean();

	private static boolean initializationBoolean() {
		// if (((-100 <= B) && (B <= 100)) && ((-100<=H) && H <= 0)) {
		if (B > 0 && H > 0) {
			return true;
		} else {
			System.out.print("java.lang.Exception: Breadth and height must be positive");
			return false;
		}

	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}

}
