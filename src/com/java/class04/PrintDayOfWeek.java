package com.java.class04;

public class PrintDayOfWeek {

	public static void main(String[] args) {

		int num = 7;

		if (num == 1) {
			System.out.println("Monday");
		} else if (num == 2) {
			System.out.print("Tue");
		} else if (num == 3) {
			System.out.print("Wed");
		} else if (num == 4) {
			System.out.print("Thursday");
		} else if (num == 5) {
			System.out.print("Fri");
		} else if (num == 6) {
			System.out.print("Sat");
		} else if (num == 7) {
			System.out.print("Sun");
		} else {
			System.out.print("Please enter valid input from 1 to 7 only");
		}

	}

}
