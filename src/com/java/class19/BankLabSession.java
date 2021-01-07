package com.java.class19;

public class BankLabSession {

	String accName;
	int accNumber = 0;
	int balance;


	BankLabSession(double balance) {
		System.out.println("From double constructor");
	}
	
	BankLabSession(int balance) {
		this.balance = balance;
	}

	BankLabSession(int balanceFromUser, String accNameFromUser) {
		balance = balanceFromUser;
		accName = accNameFromUser;
		accNumber++;
	}

	void deposit(int amount) {
		System.out.println(accName + " has deposited " + amount);
	}

	void withdraw(int amount) {
		System.out.println(accName + " is withdrawing " + amount);
		balance = balance - amount;
	}

	void displayBalance() {
		System.out.println(balance);
	}
}
