package com.java.class17;

import java.util.Scanner;

public class MethodsExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int reverse = getReverseNumber(num1);
		System.out.println(reverse);

		if (num1 == reverse) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not palindrom");
		}

	}

	static int getReverseNumber(int num) {
		int reverse = 0, lastDigit;
		while (num != 0) {
			lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num = num / 10;
		}
		return reverse;
	}
}
