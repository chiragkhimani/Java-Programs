package com.java.class20;

class Bank {
	static int balance = 5000;
	static int accNumber = 1000;
	static String accName;
	static int accountNumber;

	Bank(String accNameFromUser, int balaceFromUser) {
		accName = accNameFromUser;
		balance = balaceFromUser;
		accNumber = accNumber + 1;
		accountNumber = accNumber;
	}

	void displayBalance() {
		System.out.println(balance);
	}

	static void displayAcccountNumber() {
		System.out.println(balance);
	}

}