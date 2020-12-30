package com.java.class13;

public class CountNumberOfVowels {
	public static void main(String[] args) {
		String str = "The history of New York begins around 10,000 B.C. when the "
				+ "first people arrived. By 1100 A.D. two main cultures had become "
				+ "dominant as the Iroquoian and Algonquian developed.";
		
		str = str.toLowerCase();

		int vowelCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'e' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowelCount++;
			}
		}

		System.out.println(vowelCount);
		
		System.out.println(str.replace(" ", ""));

	}
}
