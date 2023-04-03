package com.java.conditional_statement;

import java.util.Scanner;

public class Scanner_class_2nd {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks");
		int marks=sc.nextInt();
		if(marks>=90)
		{
			System.out.println("you are Topper");
		}
		else if(marks>=75)
		{
			System.out.println("you are in distinction");
		}
		else if(marks>=60)
		{
			System.out.println("you are in 1st class");
		}
		else if(marks>=50)
		{
			System.out.println("you are in 2nd class");
		}
		else if(marks>=40)
		{
			System.out.println("you are pass");
		}
		else
		{
			System.out.println("you are fail");
		}

	}

		
}


