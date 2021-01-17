package com.java.class26;

public class PageTester {
	public static void main(String[] args) {
		Page p = new LoginPage();
		p.openPage();
		p.closePage();

		LoginPage login = new HomePage();
		login.openPage();
		login.closePage();
		
		Page page = new HomePage();
	}
}
