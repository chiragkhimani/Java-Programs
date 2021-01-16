package com.java.class25;

public class Bank {

	int balance;

	Bank() {

	}

	Bank(int balance) {
		System.out.println("From super with arg");
	}

	public void displayInterestRate() {
		System.out.println("7.8");
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void printBalance() {
		System.out.println(balance);
	}
}
