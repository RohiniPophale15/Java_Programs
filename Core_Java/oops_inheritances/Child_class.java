package com.java.oops_inheritances;

public class Child_class extends SL_Parent
{
	public void mobile() {
		System.out.println("I am mobile method from child class");
	}
	public void laptop() {
		System.out.println("I am laptop method from child class");
	}
	public static void main(String[] args) {
		Child_class obj=new Child_class();
		obj.bike();
		obj.laptop();
		obj.mobile();
		
	}

}
