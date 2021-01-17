package com.java.class26;

public class BankTester {
	public static void main(String[] args) {
		Bank acc1 = new HSBCBank();
		Bank acc2 = new CitiBank();
		acc1.deposit(1000);
		acc1.displayBalance();
		acc1.withdraw(400);
		acc1.displayBalance();

		acc2.deposit(5000);
		acc2.displayBalance();
		acc2.withdraw(1000);
		acc2.displayBalance();

	}
}
