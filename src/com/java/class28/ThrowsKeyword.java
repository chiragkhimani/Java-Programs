package com.java.class28;

public class ThrowsKeyword {
	public static void main(String[] args) {

		System.out.println("First line");

		method1();

		System.out.println("Second line");

	}

	public static void method1() {
		method2();
	}

	public static void method2() {
		try {
			method3();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void method3() throws InterruptedException {
		method4();
	}

	public static void method4() throws InterruptedException {
		Thread.sleep(3000);
	}
}
