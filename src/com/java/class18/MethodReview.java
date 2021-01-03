package com.java.class18;

public class MethodReview {
	public static void main(String[] args) {
		sum(10, 20);
	}

	static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
//	static int sum(int a, int b) {
//		return (a + b);
//	}

	static double sum(double i, double j) {
		return i + j;
	}

	static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
