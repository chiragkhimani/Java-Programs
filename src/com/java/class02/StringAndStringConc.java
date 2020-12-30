package com.java.class02;

public class StringAndStringConc {
	public static void main(String args[]) {
		String str1 = "Hello World";

		String str2 = "How are you?";

		String str3 = " ";

		System.out.println(str1 + str3 + str2);

		String str4 = "Hello ";

		String str5 = "Chirag";

		String str6 = str4 + str5;

		System.out.println(str6);

		String str = "Hello";

		int a = 10;

		int b = 20;

		System.out.println(str + a);

		System.out.println(str + a + b);

		System.out.println(str + (a + b));

		System.out.println(a + b + str);
		
		System.out.println(str + a * b);
		
//		System.out.println(str + a - b);
		
		System.out.println(a - b + str);
	}
}
