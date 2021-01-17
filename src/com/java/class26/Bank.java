package com.java.class26;

public interface Bank {

	final static double BANK_PROTOCOL = 1.23;

	void withdraw(int amount);

	void deposit(int amount);

	void getLoan();

	void displayBalance();

}

class HSBCBank implements Bank {

	int balance;

	@Override
	public void withdraw(int amount) {
		balance = balance - amount;
	}

	@Override
	public void deposit(int amount) {
		balance = balance + amount;
	}

	@Override
	public void getLoan() {
		System.out.println("Get loan from HSBC");
	}

	@Override
	public void displayBalance() {
		System.out.println(balance);
	}

}

class CitiBank implements Bank {
	int balance;

	@Override
	public void withdraw(int amount) {
		balance = balance - amount;
	}

	@Override
	public void deposit(int amount) {
		balance = balance + amount;
	}

	@Override
	public void getLoan() {
		System.out.println("Get loan from Citi Bank");
	}

	@Override
	public void displayBalance() {
		System.out.println(balance);
	}
}
