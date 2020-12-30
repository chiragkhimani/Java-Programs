package com.java.class10;

public class PalindromNumber {

	public static void main(String[] args) {
		int num = 121;
		int originalNum = num;
		int reverse = 0, lastDigit;

		while (num != 0) {
			lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num = num / 10;
		}

		System.out.println(reverse);
		System.out.println(originalNum);

		if (reverse == originalNum) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not palindrom");
		}
	}

}
