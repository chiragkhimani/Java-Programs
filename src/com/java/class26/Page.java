package com.java.class26;

public interface Page {
	void openPage();

	void closePage();
}

class LoginPage implements Page {

	@Override
	public void openPage() {
		System.out.println("Opening login page");
	}

	@Override
	public void closePage() {
		System.out.println("Closing login page");
	}

}

class HomePage extends LoginPage {
	@Override
	public void openPage() {
		System.out.println("Opening home page");
	}

	@Override
	public void closePage() {
		System.out.println("Closing home page");
	}
}
