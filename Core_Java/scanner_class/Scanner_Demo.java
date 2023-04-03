package com.java.scanner_class;

import java.util.Scanner;

public class Scanner_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your no");
		int a=sc.nextInt();
		System.out.println("enter your no");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition ="+c);
		int d=a-b;
		System.out.println("subtraction ="+d);
		int e=a*b;
		System.out.println("multiplication ="+e);
		int f=a/b;
		System.out.println("division ="+f);
		
		

	}

}
