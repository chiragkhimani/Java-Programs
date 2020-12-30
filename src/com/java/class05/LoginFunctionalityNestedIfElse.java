package com.java.class05;

public class LoginFunctionalityNestedIfElse {

	public static void main(String args[]) {
		String dbUsername = "chirag1";
		String dbPassword = "test@123";

		String username = "chirag";
		String password = "test";

		if (dbUsername == username) {

			if (dbPassword == password) {
				System.out.print("Login successful");
			} else {
				System.out.println("Invalid password");
			}

		} else if (dbPassword == password) {
			System.out.println("Wrong username");
		} else {
			System.out.println("Both incorrect");
		}

	}

}
