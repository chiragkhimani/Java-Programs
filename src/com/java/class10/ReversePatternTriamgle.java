package com.java.class10;

public class ReversePatternTriamgle {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			for (int s = 1; s <= 5 - i; s++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}

			System.out.println();

		}

		for (int i = 1; i <= 5; i++) {

			for (int s = 1; s <= i - 1; s++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(j);
			}

			for (int j = 5 - i; j >= 1; j--) {
				System.out.print(j);
			}

			System.out.println();
		}

	}

}
