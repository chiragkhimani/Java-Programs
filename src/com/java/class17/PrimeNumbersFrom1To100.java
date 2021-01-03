package com.java.class17;

public class PrimeNumbersFrom1To100 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {

			if (isPrime(i) == true) {
				System.out.println(i);
			}

		}
	}

	static boolean isPrime(int num) {

		int divisor = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				divisor++;
			}
		}

		if (divisor == 0) {
			return true;
		} else {
			return false;
		}

	}
}
