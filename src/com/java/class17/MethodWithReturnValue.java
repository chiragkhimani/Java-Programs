package com.java.class17;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		int sum = add(10, 20);
		System.out.println(sum);

		System.out.println(add(10, 20));
	}

	static int add(int a, int b) {
//		int result = a + b;
		return a + b;
	}

}
