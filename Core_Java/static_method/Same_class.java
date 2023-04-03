package com.java.static_method;

import com.java.non_static_method.Same_class1;

public class Same_class {
	public static void method1() {
		System.out.println("This is static method1");
	}
	public void method2() {
		System.out.println("This is non static method 2");
	}
	public static void method3() {
		System.out.println("This is static method 3");
	}
	public void method4() {
		System.out.println("This is non static method 4");
		
	}
	public static void main(String[] args) {
		Same_class obj=new Same_class();
		Different_class test=new Different_class();
		Same_class1 obj1=new Same_class1();
		method1();
		obj.method2();
		method3();
		obj.method4();
		Different_class.method5();
		test.method6();
		Different_class.method7();
		test.method8();
		Same_class1.method9();
		obj1.method10();
		Same_class1.method11();
		obj1.method12();
		
	}

}
