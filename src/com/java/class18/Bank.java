package com.java.class18;

public class Bank {
	
	int accoutNumber;
	String accName;
	private int balance;

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}
	
	public void showBalance() {
		System.out.println(balance);
	}

}
