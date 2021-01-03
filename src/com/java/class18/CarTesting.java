package com.java.class18;

public class CarTesting {
	public static void main(String[] args) {
		Car audiA3 = new Car();
		
		Car bmwG6 = new Car();
		
		
		audiA3.maxSpeed = 200;
		audiA3.color = "white";
		audiA3.model = "Audi A3 2020";
		
		audiA3.drive();
		bmwG6.drive();
	}
}
