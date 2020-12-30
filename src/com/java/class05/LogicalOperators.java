package com.java.class05;

public class LogicalOperators {

	public static void main(String[] args) {
		boolean b1 = true, b2 = false, b3 = true, b4 = false, result;

		result = (b1 || b2) && b4 || b4 && b3 && (b2 || b1);

		result = b1 && b2 && b4 || b3 && b4 && b3 || b2 || !b1;

		System.out.println(result);

	}
}
