package com.java.abstraction;

public class Sample3 extends Sample2 {
	public void method2(){
		System.out.println("This is method 2");
		
	}
	
	public void method3() {
		System.out.println("This is method 3");
		
	}
    public void method4() {
    	System.out.println("This is method 4");
    	
    }
	public void method5() {
		System.out.println("This is method 5");
		
	}
	public static void main(String[] args) {
		Sample3 s=new Sample3();
		s.method1();
		s.method2();
		s.method3();
		s.method4();
		s.method5();
		
	}


}
