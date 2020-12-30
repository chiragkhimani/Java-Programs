package com.java.class12;

public class FindMaxNumberFrom2DArray {
	public static void main(String[] args) {
		int[][] data = { { 12, 54, 51, 43 }, { 533, 93, 23, 53 }, { 931, 9, 3, 6 } };
		int max = data[0][1];

		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < data[i].length; j++) {
				if (data[i][j] > max) {
					max = data[i][j];
				}
			}

		}

		System.out.println(max);
	}
}
