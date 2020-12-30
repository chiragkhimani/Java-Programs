package com.java.class06;

public class SwitchStatement {
	public static void main(String args[]) {
		int num = 12;

		switch (num) {

		case 2:
			System.out.println("Two");
			break;

		default:
			System.out.println("Please enter valid input from 1 to 4 only");

		case 3:
			System.out.println("Three");
			break;

		case 1:
			System.out.println("One");
			break;

		case 4:
			System.out.println("Four");
			break;

		}

	}
}
