package com.java.class22;

import com.java.class19.Bank;

public class InheritanceReview extends Bank {

	InheritanceReview(int balanceFromUser, String accNameFromUser) {
		super(balanceFromUser, accNameFromUser);
	}
	
	public void viewUserBalance() {
		displayBalance();
	}

}
