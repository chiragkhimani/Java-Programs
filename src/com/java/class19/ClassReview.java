package com.java.class19;

class Car {

	int numOfGears;
	String color;

	Car() {
		System.out.println("Inside the constructor");
	}

	void drive() {
		System.out.println(numOfGears);
		System.out.println(color);
	}

}

public class ClassReview {
	public static void main(String[] args) {
		Car c = new Car();
		Car c1 = new Car();

	}
}
