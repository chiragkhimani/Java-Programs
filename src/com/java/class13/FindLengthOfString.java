package com.java.class13;

public class FindLengthOfString {
	public static void main(String[] args) {
		String str = "This is my first String program";

		char[] listOfChar = str.toCharArray();
		int counter =0;

		for (char c : listOfChar) {
			counter++;
		}
		
		System.out.println(counter);

	}
}
