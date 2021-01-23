package com.java.class29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(10);
		numbers.add(50);
		numbers.add(40);
		numbers.add(10);
		numbers.add(64);

		Collections.sort(numbers, Collections.reverseOrder());
		

		System.out.println(numbers);
	}
}
