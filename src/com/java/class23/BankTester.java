package com.java.class23;

public class BankTester {
	public static void main(String[] args) {
		Bank b1 = new Bank();

		b1.setAccName("Chirag");
		b1.deposit(1000);
		b1.setBalance(400);

		b1.displayBalance();

	}
}
