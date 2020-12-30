package com.java.class11;

public class FindIndexOfNumber {

	public static void main(String[] args) {
		int[] salary = { 121, 643, 752, 264, 243, 754, 234, 745, 23, 234 };
		int number = 12121;

		for (int i = 0; i < salary.length; i++) {
			if (number == salary[i]) {
				System.out.println(i);
			}
		}

	}

}
