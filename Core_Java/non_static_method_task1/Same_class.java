package com.java.non_static_method_task1;

import com.java.non_static_method_task2.Task;

public class Same_class {

	public void add() {
		System.out.println("Output from same class");
		int a,b,c;
		a=30;
		b=20;
		c=a+b;
		System.out.println("addition : "+c);
		}
	public void sub() {
		int a,b,c;
		a=40;
		b=20;
		c=a-b;
		System.out.println("subtraction : "+c);
		}
	public void multi() {
		int a,b,c;
		a=5;
		b=20;
		c=a*b;
		System.out.println("multiplication : "+c);
		}
	public void div() {
		int a,b,c;
		a=30;
		b=2;
		c=a/b;
		System.out.println("division : "+c);
		}
	public static void main(String[] args) {
	// same class object created	
		Same_class task=new Same_class();
	// different class object created
		Different_class task1=new Different_class();
		Task task2=new Task();
		task.add();
		task.sub();
		task.multi();
		task.div();
		task1.addition();
		task1.substaction();
		task2.method1();
		task2.method2();
		task2.method3();
		task2.method4();
		
	}

}
