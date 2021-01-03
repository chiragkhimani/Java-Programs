package com.java.class18;

public class PhoneTestingClass {
	
	public static void main(String[] args) {
		Phone iPhone8 = new Phone();
		iPhone8.color = "White";
		iPhone8.sizeOfRam = 4;
		iPhone8.cameraMegaPixel = 5;
		iPhone8.model = "Apple iPhone8 64GB";
		
		iPhone8.call("978963242");

		
		Phone iPhone10 = new Phone();
		
		iPhone10.color = "Black";
		iPhone10.sizeOfRam =8;
		iPhone10.cameraMegaPixel = 12;
		iPhone10.model = "Apple iPhone10 32GB";
	
		iPhone10.call("100");
	}
}
