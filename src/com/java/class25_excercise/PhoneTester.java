package com.java.class25_excercise;

public class PhoneTester {
	public static void main(String[] args) {
		Phone p;

		p = new SmartPhone();
		p.call("323423");
		p.text("334234", "test");
		p.internetSurfing();
		
		p = new NormalPhone();
//		p.call("323423");
//		p.text("334234", "test");
		
	}
}
