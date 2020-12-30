package com.java.class13;

import java.util.Scanner;

public class StringIntro {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = "Hello";
		String str4 = "Hello";
		str2 = "Hello1";
		String str3 = new String("Hello");

		System.out.println(str3 == str2);
	}
}
