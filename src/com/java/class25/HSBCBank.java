package com.java.class25;

public class HSBCBank extends Bank {

	HSBCBank() {
		super(1000);
		System.out.println("2. From Child");
	}

	int balance = 5000;

	public void withdraw() {
		super.printBalance();
	}

	public void printBalance() {
		System.out.println(super.balance);
	}

}
