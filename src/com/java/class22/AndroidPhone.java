package com.java.class22;

public class AndroidPhone extends Phone {

	public AndroidPhone(String name) {
		this.name = name;
	}
	
	public void openPlayStore() {
		System.out.println("opening play store");
	}
	
	public void repair() {
		System.out.println("repairing android " + name + " phone");
	}


}
