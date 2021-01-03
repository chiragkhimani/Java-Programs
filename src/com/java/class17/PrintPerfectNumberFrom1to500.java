package com.java.class17;

public class PrintPerfectNumberFrom1to500 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10000; i++) {
			if (isPerfectNumber(i) == true) {
				System.out.println(i);
			}
		}
	}

	static boolean isPerfectNumber(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == num) {
			return true;
		} else {
			return false;
		}
	}
}
