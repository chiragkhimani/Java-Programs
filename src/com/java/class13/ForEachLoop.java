package com.java.class13;

public class ForEachLoop {
	public static void main(String[] args) {
		int[] data = { 12, 43, 56, 32, 67, 23, 65, 35 };

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

		for (int num : data) {
			System.out.println(num);
		}

	}
}
