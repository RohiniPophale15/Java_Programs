package com.java.access_specifier;

public class Private_ac {
	int a=20;
	int b=30;
	private void method() {
		int c=a+b;
		System.out.println(c);
		System.out.println("This is private method");
	}
	public  void method1() {
		System.out.println("This is public method");
	}
	protected void method2() {
		System.out.println("This is protected method");
	}
	void method3() {
		System.out.println("This is default method");
	}
	public static void main(String[] args) {
		{
			Private_ac p=new Private_ac();
			p.method();
			p.method1();
			p.method2();
			p.method3();
			
		}
	}

}
