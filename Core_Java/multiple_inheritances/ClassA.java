package com.java.multiple_inheritances;

public class ClassA implements ClassB,ClassC{

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("This is methed 3 calling");
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("This is method 4 calling");
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("This is method 1 calling");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("This is method 2 calling");
		
	}
	public void method5() {
		System.out.println("This is method 5 calling");
	}
	public static void main(String[] args) {
		ClassA c=new ClassA();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		c.method5();
		
	}

}
