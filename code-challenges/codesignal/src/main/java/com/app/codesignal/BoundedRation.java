package com.app.codesignal;

import java.util.Arrays;

public class BoundedRation {

	public static void main(String[] args) {
		int[] a = { 8, 5, 6, 16, 5 };

		System.out.println(Arrays.toString(boundRation(a, 1, 3)));

	}

	static boolean[] boundRation(int[] a, int l, int r) {
		boolean[] operation = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			operation[i] = rangeVector(i + 1, a[i], r);
		}
		return operation;
	}

	static boolean rangeVector(int limit, int compare, int r) {
		boolean flag = false;
		int result = 0;
		for (int i = 1; i < limit; i++) {
			result = i * limit;
			if (compare == result) {
				if (i <= r) {
					flag = true;
				}
			}

		}
		return flag;
	}

}
