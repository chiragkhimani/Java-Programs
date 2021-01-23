package com.java.class27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		try {
			System.out.println("Enter first Number");
			num1 = sc.nextInt();

			System.out.println("Enter second Number");
			num2 = sc.nextInt();

			System.out.println(num1 + num2);

		} catch (InputMismatchException e) {
			System.out.println("Please enter integer value");
		}

		System.out.println("End of the program");
	}
}
