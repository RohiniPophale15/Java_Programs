package com.java.method_overloading;

public class method_ol1 {
	public void sample() {
		System.out.println("Hello everyone");
	}
	public void sample(int a) {
		System.out.println(a);
	}
	public void sample(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void sample(int a,float b) {
		System.out.println(a+b);
	}
	public void sample(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		method_ol1 obj=new method_ol1();
		obj.sample();
		obj.sample(20);
		obj.sample("Rohini");
		obj.sample(10, 2.2f);
		obj.sample(10, 20);
		
	}

}
