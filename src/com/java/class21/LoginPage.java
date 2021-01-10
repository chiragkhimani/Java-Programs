package com.java.class21;

public class LoginPage extends Page{
	public void doLogin(String username, String password) {
		System.out.println("Logging in with username and password");
	}

	public void forgetPassword(String username) {
		System.out.println("Clicking on forget password for user " + username);
	}
}
