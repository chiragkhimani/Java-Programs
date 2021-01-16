package com.java.class23;

public class Bank {
	private int balance;
	private String accNumber;
	private String accName;
	private int age;
	private String phoneNumber;
	protected int dob;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		System.out.println("Acc " + accName + " updated balance " + balance + " at 7.00am");
		this.balance = balance;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// Read access (Getter)
	public int getAge() {
		return age;
	}

	// Write access (Setter)
	public void setAge(int ageFromUser) {
		age = ageFromUser;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}

	public void displayBalance() {
		System.out.println(balance);
	}

}
