package com.java.class29;

public class BasketTester {
	public static void main(String[] args) {
		Basket<Integer> b = new Basket<Integer>();
		b.setData(10);
		System.out.println(b.getData());
		
		Basket<String> b1 = new Basket<String>();
		b1.setData("Chirag");
		System.out.println(b1.getData());
		
		Basket b2 = new Basket();
		b2.setData("Chirag");
		b2.setData(10);
		
	}
}
