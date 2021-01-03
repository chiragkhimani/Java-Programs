package com.java.class17;

public class FindReverseOf11To20 {
	public static void main(String[] args) {
		for (int i = 11; i <= 20; i++) {
			System.out.println(getReverseNumber(i));
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
