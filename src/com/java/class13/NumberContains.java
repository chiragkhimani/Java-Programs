package com.java.class13;

public class NumberContains {

	public static void main(String[] args) {
		int[] data = { 12, 43, 56, 32, 67, 23, 65, 35 };

		int num = 12;

		boolean isNumberFound = false;

		for (int tempNum : data) {

			if (tempNum == num) {
				isNumberFound = true;
			}

		}

		if (isNumberFound == true) {
			System.out.println(num + " is in the array");
		} else {
			System.out.println(num + " is not in the array");
		}

	}

}
