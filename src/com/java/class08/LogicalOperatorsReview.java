package com.java.class08;

public class LogicalOperatorsReview {

	public static void main(String[] args) {
		boolean b1 = true, b2 = false, b3 = true, b4 = true;

		boolean result = b1 && b3 && b4 || b2 || b4 && b2;

		// Find out number from 1 to 100
		// if you divide that number
		// with 5 then reminder is 4
		// with 4 then reminder is 3
		// with 3 then reminder is 2
		// with 2 then reminder is 1

		int i = 1;

		while (i <= 100) {
			if (i % 5 == 4 && i % 4 == 3 && i % 3 == 2 && i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		}

	}

}
