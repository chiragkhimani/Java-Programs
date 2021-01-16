package com.java.class25;

public abstract class Page {

	int balance;

	Page() {
		balance = 1000;
	}
	
	public static void feature1() {
		System.out.println("static method");
	}

	public abstract void openPage();

	public void closePage() {
		System.out.println("Closing page");
	}
}
