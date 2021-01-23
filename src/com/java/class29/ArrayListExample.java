package com.java.class29;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(50);
		list.add(40);
		list.add(12);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (int i : list) {
			System.out.println(i);
		}

	}
}
