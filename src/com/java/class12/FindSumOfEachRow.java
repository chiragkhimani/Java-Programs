package com.java.class12;

public class FindSumOfEachRow {
	public static void main(String args[]) {
		int[][] data = { { 12, 54, 51, 43 }, { 53, 93, 23, 53 }, { 93, 9, 3, 6 } };
		int sum = 0;

		for (int i = 0; i < data.length; i++) {

			sum = 0;
			for (int j = 0; j < data[i].length; j++) {
				sum = sum + data[i][j];
			}

			System.out.println(sum);
			System.out.println();
		}

	}
}
