package com.java.class29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(10);
		numbers.add(50);
		numbers.add(40);
		numbers.add(10);
		numbers.add(64);

		Iterator<Integer> iterator = numbers.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
