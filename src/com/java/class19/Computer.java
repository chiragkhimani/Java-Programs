package com.java.class19;

public class Computer {
	int ramSize;
	int hddSize;
	String processor;

	Computer(int ramSize) {
		System.out.println("You've called constructor with Ram size " + ramSize);
	}

	Computer(String processor) {
		System.out.println("You've called constructor with processor " + processor);
	}

	void start() {

	}

	void shutDown() {

	}

}
