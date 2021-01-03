package com.java.class06;

public class CalculatorUsingSwitch {
	public static void main(String args[]) {
		int num1 = 10, num2 = 20;

		String c = "Add";

		switch (c) {

		case "Add":
			sum(num1, num2);
			break;

		case "Sub":
			sub(num1, num2);
			break;

		case "Mul":
			mul(num1, num2);
			break;

		case "Div":
			div(num1, num2);
			break;

		default:
			System.out.print("Error");

		}

	}

	static void sum(int a, int b) {
		System.out.println(a + b);
	}

	static void sub(int a, int b) {
		System.out.println(a - b);
	}

	static void mul(int a, int b) {
		System.out.println(a * b);
	}

	static void div(int a, int b) {
		System.out.println(a / b);
	}
}
