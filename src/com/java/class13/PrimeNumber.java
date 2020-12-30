package com.java.class13;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 12;
		boolean flag = false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = true;
				System.out.println("Not Prime");
				break;
			}
		}

		if (flag == false) {
			System.out.println("Prime");
		}

	}
}
