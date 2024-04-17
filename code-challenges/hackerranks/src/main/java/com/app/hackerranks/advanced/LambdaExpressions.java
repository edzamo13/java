package com.app.hackerranks.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LambdaExpressions {

	interface PerformOperation {
		boolean check(int a);
	}

	static class MyMath {
		public static boolean checker(PerformOperation p, int num) {
			return p.check(num);
		}

		public static void main(String[] args) throws IOException {
			MyMath ob = new MyMath();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			PerformOperation op;
			boolean ret = false;
			String ans = null;
			while (T-- > 0) {
				String s = br.readLine().trim();
				StringTokenizer st = new StringTokenizer(s);
				int ch = Integer.parseInt(st.nextToken());
				int num = Integer.parseInt(st.nextToken());
				if (ch == 1) {
					op = ob.isOdd();
					ret = ob.checker(op, num);
					ans = (ret) ? "ODD" : "EVEN";
				} else if (ch == 2) {
					op = ob.isPrime();
					ret = ob.checker(op, num);
					ans = (ret) ? "PRIME" : "COMPOSITE";
				} else if (ch == 3) {
					op = ob.isPalindrome();
					ret = ob.checker(op, num);
					ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

				}
				System.out.println(ans);
			}
		}

		private PerformOperation isPalindrome() {

			PerformOperation operation = (int a) -> Integer.toString(a)
					.equals(new StringBuilder(Integer.toString(a)).reverse().toString());
			return operation;
		}

		private PerformOperation isPrime() {
			PerformOperation operation = num -> java.math.BigInteger.valueOf(num).isProbablePrime(1);
			return operation;
		}

		private PerformOperation isOdd() {
			PerformOperation operation = num -> !(num % 2 == 0);
			return operation;
		}

	}

}
