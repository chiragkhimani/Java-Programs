package com.java.class24;

public class Bank {
	private int balance;

	Bank(int balanceFromUser) {
		balance = balanceFromUser;
	}

	public void withdraw(int amount) {
		setBalance(getBalance() + amount);
	}

	public void deposit(int amount) {

	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
