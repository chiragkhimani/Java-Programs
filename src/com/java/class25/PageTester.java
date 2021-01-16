package com.java.class25;

public class PageTester {
	public static void main(String[] args) {
		LoginPage loginPage = new LoginPage();
		loginPage.openPage();
		
		Page p = new Page();

		Bank b = new Bank();
		b.displayInterestRate();
	}
}
