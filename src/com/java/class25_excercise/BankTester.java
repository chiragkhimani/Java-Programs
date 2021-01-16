package com.java.class25_excercise;

public class BankTester {
	public static void main(String[] args) {
		HSBCBank acc1 = new HSBCBank();
		CitiBank acc2 = new CitiBank();
		
		acc1.deposit(1000);
		acc1.displayBalance();
		
		acc1.getBusinessLoan();
		
		acc1.displayBranchAddress();
		
		acc2.openSalaryAccount();
		acc2.deposit(4000);
		acc2.displayBalance();
		
	}
}
