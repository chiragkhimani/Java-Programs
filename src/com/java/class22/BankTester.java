package com.java.class22;

class HSBCBank extends Bank {

	@Override
	public void displayInterestRate() {
		System.out.println("6.0%");
	}

	@Override
	public void calculateInterest() {
		System.out.println(balance * 6.0 / 100);
	}
}

class CityBank extends Bank {
	public void displayInterestRate() {
		System.out.println("7.0%");
	}

	public void calculateInterest() {
		System.out.println(balance * 7.0 / 100);
	}
}

public class BankTester {
	public static void main(String[] args) {
		HSBCBank hsbcAcc1 = new HSBCBank();
		hsbcAcc1.displayInterestRate();
		hsbcAcc1.withdraw(500);
		hsbcAcc1.calculateInterest();

		CityBank cityBankAcc1 = new CityBank();
		cityBankAcc1.displayInterestRate();
		cityBankAcc1.deposit(5000);
		cityBankAcc1.calculateInterest();
	}
}