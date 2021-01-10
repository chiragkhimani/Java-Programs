package com.java.class21;

public class Car extends Vehicle {
	
	Car(){
		System.out.println("From Car");
	}

	public void playMusic(String song) {
		System.out.println("Playing song " + song + " in " + name);
	}

	public void turnOnAC() {
		System.out.println("Tuning on ac in " + name);
	}

}
