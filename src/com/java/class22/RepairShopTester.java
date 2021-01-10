package com.java.class22;

public class RepairShopTester {
	public static void main(String[] args) {
		AndroidPhone galaxyA6 = new AndroidPhone("Samsung Galaxy A6");
		Iphone iPhoneX = new Iphone("Apple iPhoneX");

		RepairShop rs = new RepairShop();
		rs.repairPhone(galaxyA6);
		rs.repairPhone(iPhoneX);
	}
}
