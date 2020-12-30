package com.java.class09;

public class DisplayDigit {

	public static void main(String[] args) {
		int num = 23456545;

		int lastDigit;

		while (num != 0) {
			lastDigit = num % 10;
			System.out.println(lastDigit);
			num = num / 10;
		}

	}

}
