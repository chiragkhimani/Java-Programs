package com.java.class21;

class A {
	A() {
		System.out.println("From A");
	}
	
	A(int num){
	    	System.out.println("From A with argument");
	}
}

class B extends A {
	B(int num) {
		System.out.println("From B with argument");
	}
	
	B(){
	    System.out.println("From B");
	}
}

class C extends B {
	C() {
	    super(10);
		System.out.println("From C");
	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
        C c = new C();

	}
}