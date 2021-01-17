package com.java.class26;

interface A extends B, C {
	public void featureA1();
}

interface B{
	public void featureB1();
}

interface C {
	public void featureC1();
}

class Demo implements A {

	@Override
	public void featureA1() {

	}

	@Override
	public void featureB1() {

	}

	@Override
	public void featureC1() {

	}

}