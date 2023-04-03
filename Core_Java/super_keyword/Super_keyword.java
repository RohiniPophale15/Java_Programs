package com.java.super_keyword;

public class Super_keyword {
	int a=10;
	float b=20.3f;
}
class Child_class extends Super_keyword{
	public void method() {
		System.out.println(super.a);
		System.out.println(super.b);
	}
	public static void main(String[] args) {
		int c=20;
		float d=30.4f;
		Child_class obj=new Child_class();
		obj.method();
		System.out.println(c);
		System.out.println(d);
		
	}
	
}
