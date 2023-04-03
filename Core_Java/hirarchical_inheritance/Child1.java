package com.java.hirarchical_inheritance;

public class Child1 extends Parent1{
	public void child1() {
		System.out.println("I am child 1 from child1 class");
	}
	public void child2() {
		System.out.println("I am child 2 from child1 class");
	}
	public void child3() {
		System.out.println("I am child 3 from child1 class");
	}
	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.child1();
		obj.child2();
		obj.child3();
		obj.parent1();
		obj.parent2();
		obj.parent3();
		Child2 obj1=new Child2();
		obj1.child4();
		obj1.child5();
		obj1.child6();
		obj1.parent1();
		obj1.parent2();
		obj1.parent3();
		Child3 obj2=new Child3();
		obj2.child7();
		obj2.child8();
		obj2.child9();
		obj2.parent1();
		obj2.parent2();
		obj2.parent3();
		
	}

}
