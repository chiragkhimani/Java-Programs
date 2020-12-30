package com.java.class05;

public class BloodDonation {
	public static void main(String[] args) {
		int age = 42, weight = 45;

		if (age >= 18) {

			if (weight >= 50) {
				System.out.println("You're eligible");
			} else {
				System.out.print("Under weight");
			}
			
		} else {
			System.out.print("Too young");
		}

	}
}
