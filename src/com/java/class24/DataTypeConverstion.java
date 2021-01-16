package com.java.class24;

public class DataTypeConverstion {
	public static void main(String[] args) {
		String i = "10", j = " 20               ";

		double d = 5.456;

		int a = Integer.parseInt(i);
		int b = Integer.parseInt(j.trim());

		i = String.valueOf(a);
		j = String.valueOf(b);

		String sd = String.valueOf(d);
		
		System.out.println(sd + j);

	}
}
