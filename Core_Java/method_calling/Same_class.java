package com.java.method_calling;

import com.java.diff_package.Diff_pack_diff_class;

public class Same_class {
	public static void main(String[] args) {
		// method call from same class
		method1();
		method2();
		//method call from different class
		//you can call one single method for multiple times
		Diffrent_class.method3();
		Diffrent_class.method3();
		Diffrent_class.method3();
		Diffrent_class.method4();
		//method call from different package
		Diff_pack_diff_class.method5();
		Diff_pack_diff_class.method6();
		
		
	}
	public static void method1() {
		System.out.println("I am static method 1 call from same class");
	}
	public static void method2() {
		System.out.println("I am static method 2 call from same class");
	}

}
