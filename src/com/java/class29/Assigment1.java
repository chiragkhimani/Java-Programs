package com.java.class29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assigment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> data = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			data.add(sc.nextInt());
		}

		System.out.println("You entered " + data);
		
		Collections.sort(data);
		
		System.out.println(data);
		
		List<Integer> copyOfData = new ArrayList<Integer>(data);
		
		Collections.sort(copyOfData, Collections.reverseOrder());
		
		Collections.reverse(copyOfData);
		
		System.out.println(copyOfData);
		
		System.out.println(data.equals(copyOfData));
		

	}
}
