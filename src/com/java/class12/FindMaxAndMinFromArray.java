package com.java.class12;

public class FindMaxAndMinFromArray {
	public static void main(String args[]) {
		int[] data = { 12, 666, 23, 65, 75, 34, 76, 34, 322, 86, 56 };

		int max = data[0];

		for (int i = 1; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}

		System.out.println("Max value is " + max);

	}
}
