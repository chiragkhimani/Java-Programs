package com.java.class28;

public class FinallyBlock {
	public static void main(String[] args) {
		
		
		int num[] = {324, 34, 643, 64,3};
		
		try {
			System.out.println("Start of try block");
			System.out.println(num[11]);
			System.out.println("Number is printed");
			System.out.println("Rest of the code to proceed further");
		}catch(ArithmeticException e) {
			System.out.println("Start of catch block");
			e.printStackTrace();
			System.out.println("End of catch block");
		}finally {
			System.out.println("I'll be executed for sure");
		}
		
	}
}
