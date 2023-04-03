package com.java.generalizaltion;

public class Child1_class extends Parent_class {
	public void method4() {
		System.out.println("This is method 4");
	}
	public static void main(String[] args) {
		Child1_class c=new Child1_class();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		Child2_class c1=new Child2_class();
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method5();
	}

}
