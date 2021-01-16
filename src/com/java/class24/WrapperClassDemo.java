package com.java.class24;

public class WrapperClassDemo {
	public static void main(String[] args) {
		String num1 = "10", num2 = "20";

		int i = 10, j = 20;

		Integer a = i; // Converting primitive data type to object automatically

		Integer b = new Integer(j); // Converting primitive data to object explicitly

		Integer c = new Integer(50);

		int k = c; // Auto unboxing

		int m = c.intValue(); // unboxing
		

	}
}
