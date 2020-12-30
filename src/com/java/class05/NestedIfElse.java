package com.java.class05;

public class NestedIfElse {
	public static void main(String[] args) {
		int a = 10, b = 42, c = 23;

		if (a > b) {
			if (a > c) {
				System.out.print(a + " is greatest");
			}
		} else {
			if (b > c) {
				System.out.print(b + " is greatest");
			} else {
				System.out.print(c + " is greatest");
			}
		}

	}
}
