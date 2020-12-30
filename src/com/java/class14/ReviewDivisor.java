package com.java.class14;

public class ReviewDivisor {
	public static void main(String arg[]) {
		int num = 28;
		int sum = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == num) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not Perfect Number");
		}

	}
}
