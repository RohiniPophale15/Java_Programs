package com.java.non_static_method_task1;

public class Different_class {
	public void addition() {
		System.out.println("\nOutput from diffrent class");
		int x,y,z;
		x=30;
		y=10;
		if(x>y) {
			z=x+y;
			System.out.println(z);
		}
		else {
			z=(x+y)*5;
			System.out.println(z);
		}
	}
	public void substaction() {
		int x,y,z;
		x=30;
		y=10;
		if(x<y) {
			z=x-y;
			System.out.println(z);
		}
		else {
			z=(x-y)*5;
			System.out.println(z);
		}
		
	}

}
