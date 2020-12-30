package com.java.class06;

public class SwitchNumberOfDaysInMonth {
	public static void main(String[] args) {
		int num = 3;

		switch (num) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 10:
		case 8:
		case 12:
			System.out.println("31");
			break;
		case 2:
			System.out.print("28/29");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.print("30");
			break;

		default:
			System.out.print("Please enter valid input from 1 to 12 only");
		}
	}
}
