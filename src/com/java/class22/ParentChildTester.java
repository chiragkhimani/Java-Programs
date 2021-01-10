package com.java.class22;

public class ParentChildTester {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.feature1();
		
		Child c = new Child();
		c.feature1();
		
		Parent pc = new Child();
		pc.feature1();
		
		Child cp = new Parent();
	}
}
