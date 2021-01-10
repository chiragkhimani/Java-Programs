package com.java.class22;

public class Iphone extends Phone {
	
	public Iphone(String name) {
		this.name = name;
	}

	public void openAppleStore() {
		System.out.println("opening apple store");
	}
	
	public void repair() {
		System.out.println("repairing Iphone " + name + " phone");
	}


}
