package com.java.class19;

public class Bank {

	String accName;
	int accNumber = 0;
	int balance;
	
	Bank(int balanceFromUser, String accNameFromUser){
		balance = balanceFromUser; 
		accName = accNameFromUser;
		accNumber++;
	}

	void deposit(int amount) {
		System.out.println(accName+ " has deposited "+amount);
		balance = balance + amount;
	}

	void withdraw(int amount) {
		System.out.println(accName+ " is withdrawing "+amount);
		balance = balance - amount;
	}

	void displayBalance() {
		System.out.println(balance);
	}
}
