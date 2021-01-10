package com.java.class19;

public class Bank {

	String accName;
	int accNumber = 0;
	int balance;
	
	public Bank(int balanceFromUser, String accNameFromUser){
		balance = balanceFromUser; 
		accName = accNameFromUser;
		accNumber++;
	}

	public void deposit(int amount) {
		System.out.println(accName+ " has deposited "+amount);
		balance = balance + amount;
	}

	public void withdraw(int amount) {
		System.out.println(accName+ " is withdrawing "+amount);
		balance = balance - amount;
	}

	public void displayBalance() {
		System.out.println(balance);
	}
}
