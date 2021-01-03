package com.java.class17;

public class ListOfPalindroNumbers {
	public static void main(String[] args) {
		for (int i = 11; i <= 500; i++) {
			if (isPalindromNumber(i) == true) {
				System.out.println(i);
			}
		}
	}

	static boolean isPalindromNumber(int num) {
		int reverse = 0, lastDigit, originalNum = num;
		while (num != 0) {
			lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num = num / 10;
		}

		if (reverse == originalNum) {
			return true;
		} else {
			return false;
		}

	}

}
