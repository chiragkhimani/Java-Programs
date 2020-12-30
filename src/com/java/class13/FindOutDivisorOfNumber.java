package com.java.class13;

public class FindOutDivisorOfNumber {
	public static void main(String[] args) {
		int num = 12;

		for (int i = 1; i <= 12; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}

	}
}
