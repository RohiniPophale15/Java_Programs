package com.java.conditional_statement;

import java.util.Scanner;

public class Nested_if_else {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
	    if(age<18) {
	    	System.out.println("You are minor! not eligible to work");
	    }
	    else {
	    	if(age>=18 && age<=60) {
	    		System.out.println("you are eligible to work");
	    	}
	    	else {
	    		System.out.println("Happy retirement");
	    	}
	    }
	}

}
