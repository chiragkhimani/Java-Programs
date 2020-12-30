package com.java.class09;

public class PrintEvenNumberWhileLoop {
	public static void main(String args[]) {
	
		int i = 1;

		while (i <= 10) {

			if (i % 2 != 1) {
				System.out.println(i);
			}

			i++;
		}

	}
}
