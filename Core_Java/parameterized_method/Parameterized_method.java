package com.java.parameterized_method;

public class Parameterized_method {
	public static void addition(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void substraction(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}

	public static void multiplication(int a,int b) {
		int c=a*b;
		System.out.println(c);
	}

	public static void division(int a,int b) {
		float c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		addition(50,20);
		substraction(50,20);
		multiplication(5,20);
		division(50,2);
		
	}


}
