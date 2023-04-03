package com.java.parameterized_method;

public class Parameterized_method_task {
	public  static void addition(int x,int y) {
		int z;
		if(x<y) {
			z=x+y;
			System.out.println(z);
		}
		else {
			z=(x+y)*5;
			System.out.println(z);
		}
	}
	public void substaction(int x,int y) {
		int z;
		if(x>y) {
			z=x-y;
			System.out.println(z);
		}
		else {
			z=(x-y)*5;
			System.out.println(z);
		}
	}
	public  static void multi(int x,int y) {
			int z;
			if(x<y) {
				z=x*y;
				System.out.println(z);
			}
			else {
				z=(x*y)*5;
				System.out.println(z);
			}
	}
	public void division(int x,int y) {
				int z;
				if(x>y) {
					z=x/y;
					System.out.println(z);
				}
				else {
					z=(x/y)*5;
					System.out.println(z);
				}
	}
	public static void main(String[] args) {
		addition(10,20);
		multi(2,20);
		Parameterized_method_task obj=new Parameterized_method_task();
		obj.substaction(12, 15);
		obj.division(400, 20);
		
	}


}
