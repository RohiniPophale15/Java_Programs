package com.java.hirarchical_inheritance_task;

public class Parent1 extends Child1 {
	public void parent1() {
		System.out.println("I am parent 1 from parent1 class");
	}
	public void parent2() {
		System.out.println("I am parent 2 from parent1 class");
	}
	public void parent3() {
		System.out.println("I am parent 3  from parent1 class");
	}
	public static void main(String[] args) {
		System.out.println("*****Parent class 1 methods******* \n");
	    
		Parent1 obj=new Parent1();
		obj.child1();
		obj.child2();
		obj.child3();
		obj.parent1();
		obj.parent2();
		obj.parent3();
		
		System.out.println("*****Parent class 2 methods*******\n ");
		
		Parent2 obj2=new Parent2();
		obj2.child1();
		obj2.child2();
		obj2.child3();
		obj2.parent4();
		obj2.parent5();
		obj2.parent5();
		obj2.parent6();
		
        System.out.println("*****Parent class 3 methods*********\n ");
        
		Parent3 obj3= new Parent3();
		obj3.child1();
		obj3.child2();
		obj3.child3();
		obj3.parent7();
		obj3.parent7();
		obj3.parent8();
		obj3.parent9();
	}

}
