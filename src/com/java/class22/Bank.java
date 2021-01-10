package com.java.class22;

public class Bank {

	int balance;

	public Bank() {
		balance = 1000;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public void displayInterestRate() {
		System.out.println("4.0%");
	}

	public void calculateInterest() {
		System.out.println(balance * 4.0 / 100);
	}

}
