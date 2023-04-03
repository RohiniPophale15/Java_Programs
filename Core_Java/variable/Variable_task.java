package com.java.variable;

public class Variable_task {
	int x=20;
	static int y=30;
	public void method1() {
		int a=5;
		int b=10;
		int c=a+b;
		System.out.println(c);
	//r is local variable in method 2	
    //System.out.println(r);
		System.out.println(x);
		System.out.println(y);
		
	}
	public void method2() {
		int p=30;
		int q=10;
		int r=p-q;
		System.out.println(r);
	// c is local variable in method 1	
	//	System.out.println(c);
		System.out.println(x);
		System.out.println(y);
		
		
	}
	public static void method3() {
		int d=2;
		int e=20;
		int f=d*e;
		System.out.println(f);
		// c is local variable in method 1	
	    //System.out.println(c);
		//System.out.println(r);
        //System.out.println(r);
		// x is non static global variable not applicable in static method
        //System.out.println(x);
		System.out.println(y);
		
	}
	public static void main(String[] args) {
		Variable_task v1=new Variable_task();
		v1.method1();
		v1.method2();
	    method3();
	
	}

}
