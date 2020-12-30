package com.java.class13;

public class SequenceOfChar {

	public static void main(String[] args) {
		String str = "The history of New York begins around 10,000 B.C. when the "
				+ "first people arrived. By 1100 A.D. two main cultures had become "
				+ "dominant as the Iroquoian and Algonquian developed.";

		int frequecyCounter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
				frequecyCounter++;
			}
		}

		System.out.println(frequecyCounter);

	}

}
