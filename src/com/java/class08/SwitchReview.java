package com.java.class08;

public class SwitchReview {
	public static void main(String[] args) {
		int a = 10, b =8, c = 6, d=-4;
		
		a = 5;
        
        switch(a+d){
            
		case 10:
			System.out.println("Inside case 10");

		case 23:
			System.out.println("Inside case 8");

		case 43:
			System.out.println("Inside case 6");
                
            default: 
                System.out.println("No Match");
            
        }
        

	}
}
