package com.java.class12;

public class TwoDimentionArray {
	public static void main(String args[]) {
		// Declaration & initialization of array

//		int[][] data = new int[5][4];

		int[][] data = { { 12, 54, 51 }, { 93, 23, 53 }, { 9, 3, 6 } };

//		System.out.println(data.length);

//		System.out.println(data[0].length);

		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}

			System.out.println();
		}

	}
}
