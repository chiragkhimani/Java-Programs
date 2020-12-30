package com.java.class03;

import java.util.Scanner;

public class ScannerClassExample {
	public static void main(String strg[]) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		sc.nextLine();
		
		String str = sc.nextLine();
		
		System.out.println(str);

		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}
}
