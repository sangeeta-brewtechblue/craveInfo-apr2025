package com.sj;

public class A {
	
	int a;
	
	
	public A(int a) {
		super();
		this.a = a;
	}

	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
	
	@Override
	public void finalize() {
		System.out.println("gc running");
	}
	
	

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	

}
