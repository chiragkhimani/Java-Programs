package com.java.class25;

public class ShapeTester {
	public static void main(String[] args) {
		Shape s;

		s = new Circle();
		s.draw();
		s.erase();
		
		s = new Squre();
		s.draw();
		s.erase();

	}
}
