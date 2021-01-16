package com.java.class23;

class Bank1 {

	public void getLoan() {
		System.out.println("Getting loan from Bank");
	}
}

class HSBCBank1 extends Bank1 {
	public void getLoan() {
		System.out.println("Getting loan from HSBC Bank");
	}
}

public class BankTester1 {
	public static void main(String[] args) {
		// Reference of bank class
		Bank1 b1;

		b1 = new HSBCBank1();
		b1.getLoan();
	}
}
