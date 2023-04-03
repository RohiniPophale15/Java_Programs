package com.java.method_overloading;

public class method_ol {
	public void m1(int a) {
		System.out.println(a);
	}
	public void m1(int a,int b) {
		System.out.println(a+b);
	}

public void m1(String s) {
		System.out.println(s);
	}
	public void m1() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		method_ol m=new method_ol();
		m.m1();
		m.m1(10);
		m.m1("Rohini");
		m.m1(20,20);
		
		
	}
}
