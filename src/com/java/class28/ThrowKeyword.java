package com.java.class28;

import java.util.Scanner;

public class ThrowKeyword {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		String dayName = null;

		switch (day) {
		case 1:
			dayName = "Monday";
			break;

		case 2:
			dayName = "Tue";
			break;

		case 3:
			dayName = "Wed";
			break;

		case 4:
			dayName = "Thur";
			break;

		case 5:
			dayName = "Fri";
			break;

		default:
			throw new Exception("Invalid argument. Enter 1 to 5 only");
		}

		System.out.println("Enjoy your " + dayName);
	}
}
