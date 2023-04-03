package com.java.oops_interface;

public class Implement implements Interface {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("This is method 1 calling ");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("This is method 2 calling");
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("This is method 3 calling");
		
	}
	public void method4() {
		System.out.println("This is mathod 4 calling");
	}
	public static void main(String[] args) {
		Implement i=new Implement();
		i.method1();
		i.method2();
		i.method3();
		i.method4();
		
	}

}
