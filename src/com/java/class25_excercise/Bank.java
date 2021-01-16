package com.java.class25_excercise;

public abstract class Bank {

	int balance;

	public abstract void displayInterestRate();

	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public void displayBalance() {
		System.out.println(balance);
	}
	
	public abstract void displayBranchAddress();
}
