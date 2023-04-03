package com.java.conditional_statement;

import java.util.Scanner;

public class Nested_if_2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("you are applicable for voting");
			if(age>=30) {
				System.out.println("you are applcable for goverment job");
			}
			else {
				System.out.println("you are not applicable for goverment job");
			}
		}
		else {
			System.out.println("you are not applicable for voting");
		}

	}

}
