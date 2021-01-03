package com.java.class18;

public class PersonTestingClass {
	public static void main(String[] args) {

		Person yusuf = new Person();

		Person chirag = new Person();
		
		yusuf.name = "Yusuf Ates";
		
		yusuf.age = 23;
		
		yusuf.gender = 'm';
		
		yusuf.height = 10.0;
		
		System.out.println(yusuf.age);
		
		System.out.println(chirag.age);
		
		yusuf.eat();
		
		chirag.eat();
		
		yusuf.displayPersonInfo();
		
		chirag.displayPersonInfo();
	}
}
