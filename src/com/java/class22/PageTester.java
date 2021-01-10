package com.java.class22;

public class PageTester {
	public static void main(String[] args) {
		Utility utility = new Utility();
		utility.openPage(new LoginPage());
		utility.openPage(new HomePage());
		
		
	}
}
