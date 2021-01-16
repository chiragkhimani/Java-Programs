package com.java.class25_excercise;

public class NormalPhone extends Phone {

	@Override
	public void call(String number) {
		System.out.println("Call from normal phone to " + number);
	}

	@Override
	public void text(String number, String message) {
		System.out.println("text from normal phone to " + number + " with " + message);
	}

}
