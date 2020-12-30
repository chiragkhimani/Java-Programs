package com.java.class04;

public class DiscountedBill {

	public static void main(String args[]) {
		int billAmount = 9000;

		if (billAmount > 10000) {
			System.out.println("You've givne 15% Discount. your final bill is " + billAmount * 0.85);
		} else if (billAmount > 8000) {
			System.out.println("You've givne 10% Discount. your final bill is " + billAmount * 0.90);
		} else if (billAmount > 5000) {
			System.out.println("You've givne 5% Discount. your final bill is " + billAmount * 0.95);
		} else if (billAmount > 0) {
			System.out.println("You've givne 0% Discount. your final bill is " + billAmount);
		} else {
			System.out.println("Please contact our admin office your bill is incorrect");
		}

	}
}
