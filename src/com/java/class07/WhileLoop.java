package com.java.class07;

public class WhileLoop {

	public static void main(String[] args) {

		// Print all numbers from 1 to 10 which is divisible by 3

		int a = 1;

		while (a <= 10) {
			if (a % 3 == 0) {
				System.out.println(a);
			}
			a++;
		}

	}

}
