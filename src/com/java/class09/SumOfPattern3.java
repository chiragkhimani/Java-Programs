package com.java.class09;

// 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5

public class SumOfPattern3 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
	}
}
