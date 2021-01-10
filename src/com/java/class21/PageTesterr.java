package com.java.class21;

public class PageTesterr {
	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		login.doLogin("Chirag", "Test@123");
		login.validateLogoIsDispalyed();
		login.validatePageTitle();

		HomePage home = new HomePage();
		home.searchProduct("TV");
		home.validateLogoIsDispalyed();

	}
}
