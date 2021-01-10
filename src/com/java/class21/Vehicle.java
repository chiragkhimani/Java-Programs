package com.java.class21;

// Create a class Vehicle, Car, Bike and try to use inheritance concpet
public class Vehicle {
	
	public Vehicle() {
		System.out.println("From Vehical");
		name="Honda City";
	}

	String name;

	public void drive() {
		System.out.println("driving " + name);
	}

	public void pressBreak() {
		System.out.println("pressing break in " + name);
	}
}
