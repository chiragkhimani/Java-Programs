package com.java.class29;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		
		List<String> fruits = new LinkedList<String>();

		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		System.out.println(fruits.size());

		System.out.println(fruits.isEmpty());

		System.out.println(fruits);

		Object[] data = fruits.toArray();

		for (Object stringdata : data) {
			System.out.println((String)stringdata);
		}

		System.out.println(fruits.contains("Apple"));

		
		for (String fruit : fruits) {
			if(fruit.equalsIgnoreCase("Orange")) {
				System.out.println(true);
			}
		}
		
		
	}
}
