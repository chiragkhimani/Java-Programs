package com.java.class04;

public class LadderIfElse {
	public static void main(String args[]) {

		// Take number from user and print number of days in given month

		int num = 2;

		if (num == 1) {
			System.out.println("31");
		} else if (num == 2) {
			System.out.print("28/29");
		} else if (num == 3) {
			System.out.print("31");
		} else if (num == 4) {
			System.out.print("30");
		} else if (num == 5) {
			System.out.print("31");
		} else if (num == 6) {
			System.out.print("30");
		} else if (num == 7) {
			System.out.print("31");
		} else if (num == 8) {
			System.out.print("31");
		} else if (num == 9) {
			System.out.print("30");
		} else if (num == 10) {
			System.out.print("31");
		} else if (num == 11) {
			System.out.print("30");
		} else if (num == 12) {
			System.out.print("31");
		} else {
			System.out.print("Please enter valid input from 1 to 12 only");
		}

	}
}
