package com.java.class27;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		int i = 100, j = 10;
		int a[] = { 23, 34, 5, 35, 56 };
		Scanner sc = null;

		try {
			System.out.println(a[12]);
			System.out.println(i / j);
			sc.nextInt();
		} catch (ArithmeticException e) {
			System.out.println("1");
		} catch (Exception e) {
			System.out.println("1");
		}

		System.out.println("End of program");

	}
}
