package com.java.class13;

public class FibonaciiSeries {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;

		int sum = num1 + num2;

		int limit = 30;

		System.out.println(num1);
		System.out.println(num2);

		while (sum <= limit) {
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
			sum = num1 + num2;
		}

	}
}
