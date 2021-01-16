package com.java.class24;

public class BankTester {
	public static void main(String[] args) {
		Bank acc1 = new Bank(5000);
		acc1.withdraw(2342342);
		
		System.out.println(acc1.getBalance());
	}
}
