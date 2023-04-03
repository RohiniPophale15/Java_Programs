package com.java.no_return_type;

public class No_return_type {
	public static int addition() {
		int a=50;
		int b=30;
		int c=a+b;
		return c;
		
	
	}
	public static int substraction() {
		int a=50;
		int b=30;
		int c=a-b;
		return c;
		
	
	}
	public static void main(String[] args) {
	//In return type method called in this way	
		System.out.println(addition());
    //	we can also call method in this way
		int x=substraction();
		System.out.println(x);
	}

}
