package com.java.class09;

import java.util.Scanner;

public class Multiplication1to5 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int mul = 1;

		for (int i = 1; i <= num; i++) {
			mul = mul * i;
		}

		System.out.println(mul);
	}
}
