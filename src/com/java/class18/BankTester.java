package com.java.class18;

public class BankTester {
	public static void main(String[] args) {
		Bank hsbc = new Bank();
		hsbc.accName = "Chirag";
		hsbc.accoutNumber = 3243253;
		hsbc.deposit(1000);
		hsbc.showBalance();
		hsbc.withdraw(500);
		hsbc.showBalance();
	}
}
