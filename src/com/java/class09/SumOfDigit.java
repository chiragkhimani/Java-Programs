package com.java.class09;

public class SumOfDigit {
	public static void main(String args[]) {
		int num = 435;

		int lastDigit, sum = 0;

		while (num != 0) {
			lastDigit = num % 10;
			sum = sum + lastDigit;
			num = num / 10;
		}

		System.out.println(sum);

	}
}
