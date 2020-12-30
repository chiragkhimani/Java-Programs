package com.java.class08;

public class NestedIfReview {

	public static void main(String[] args) {
		int a = 14, b = 41, c = -4;

		if (b > a + c) {

			if (c < -4) {
				System.out.println("C is smaller");
			} else {
				if (b + c == a){
					System.out.println("b+c is not a");
				}
			}

		} else {
			if (a == 14) {
				System.out.println("A is 14");
			}
		}
	}

}
