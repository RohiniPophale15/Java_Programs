package com.java.variable;

public class Variable {
	int i=20;
	static int  j=50;
	public void m1() {
		int a=10;
		System.out.println(a);
	//	b is local variable of method m2();
    //	System.out.println(b);
		System.out.println(i);
		System.out.println(j);
		
	}
	public void m2() {
		int b=12;
		System.out.println(b);
	//a is local variable of method m1();	
	//System.out.println(a);
		System.out.println(i);
		System.out.println(j);
	}
	public static void m3() {
		int c=14;
		System.out.println(c);
	// i is non static global variable not applicable in static method	
    //	System.out.println(i);
		System.out.println(j);
		
	}
	public static void main(String[] args) {
		Variable v1=new Variable();
		v1.m1();
		v1.m2();
		m3();
	
		
		
	}

}
