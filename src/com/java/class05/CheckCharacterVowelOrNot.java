package com.java.class05;

public class CheckCharacterVowelOrNot {
	public static void main(String str[]) {
		char c = 'q';
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
			System.out.println("Vowel");
		}else {
			System.out.println("Not Vowel");
		}
		
	}
}
