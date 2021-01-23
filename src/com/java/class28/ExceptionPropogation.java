package com.java.class28;

public class ExceptionPropogation {
	public static void main(String[] args) {
		method1();
	}

	public static void method1() {
		try {
			method2();
		} catch (Exception e) {
			System.out.println("Something went wrong!");
		}
	}

	public static void method2() {
		method3();
	}

	public static void method3() {
		method4();
	}

	public static void method4() {
		int i = 10, j = 0;
		System.out.println(i / j);
	}
}
