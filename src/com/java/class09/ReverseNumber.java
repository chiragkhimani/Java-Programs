package com.java.class09;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 2376;
		int reverse = 0, lastDigit;

		while (num != 0) {
			lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num = num / 10;
		}

		System.out.println(reverse);
	}

}
