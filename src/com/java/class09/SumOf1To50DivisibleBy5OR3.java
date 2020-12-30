package com.java.class09;

public class SumOf1To50DivisibleBy5OR3 {
	public static void main(String[] args) {

		int sum = 0;
		
		
		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}

		System.out.println(sum);
	}
}
