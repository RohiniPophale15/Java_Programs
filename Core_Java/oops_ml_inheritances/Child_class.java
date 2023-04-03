package com.java.oops_ml_inheritances;

public class Child_class extends Parent_class
{
	public void child1() {
		System.out.println("I am child 1 from child class");
	}
	public void child2() {
		System.out.println("I am child 2 from child class");
	}
	public void child3() {
		System.out.println("I am child 3 from child class");
	}
	public static void main(String[] args) {
		Child_class obj=new Child_class();
		obj.child1();
		obj.child2();
		obj.child3();
		obj.parent1();
		obj.parent2();
		obj.parent3();
		obj.grand_parent1();
		obj.grand_parent2();
		obj.grand_parent3();
		
	}



}
