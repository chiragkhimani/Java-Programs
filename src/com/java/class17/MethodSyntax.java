package com.java.class17;

import java.util.Scanner;

public class MethodSyntax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printLine(25,'*');
		System.out.println("Please enter number");
		int num1 = sc.nextInt();
		printLine(50,'=');
		System.out.println("You've entered " + num1);
		printLine(50,'=');
	}
	
	static void printLine(int lengthOfLine, char symbol) {

		for (int i = 1; i <= lengthOfLine; i++) {
			System.out.print(symbol);
		}

		System.out.println();
	}

}
