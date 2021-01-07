package com.java.class19;

public class BankTester {
	public static void main(String[] args) {
		Bank acc1 = new Bank(1000, "Chirag");
		Bank acc2 = new Bank(5000, "John");
		Bank acc3 = new Bank(5000, "Mehmet");
		Bank acc4 = new Bank(5000, "Inna");
		Bank acc5 = new Bank(5000, "Rabia");
		
		System.out.println(acc1.accNumber);
		System.out.println(acc2.accNumber);
		System.out.println(acc3.accNumber);
		System.out.println(acc5.accNumber);
	}
}
