package com.app.hackerranks.basic;

import java.util.Scanner;

public class StdinAndStdout {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
