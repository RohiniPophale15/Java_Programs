package com.java.conditional_statement;

import java.util.Scanner;

public class Scanner_class_3rd {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your budget");
		int budget=sc.nextInt();
		if(budget>=60000) {
			System.out.println("You can buy IPhone");
		}
		else if(budget>=40000)
		{
			System.out.println("you can buy OnePlus");
		}
		else if(budget>=30000)
		{
			System.out.println("you can buy Sumsung");
		}
		else if(budget>=20000)
		{
			System.out.println("you can buy Redmi");
		}
		else if(budget>=15000)
		{
			System.out.println("you can buy Oppo");
		}
		else if(budget>=10000)
		{
			System.out.println("you can buy Vivo ");
			
		}
		else if(budget>=5000)
		{
			System.out.println("you can buy Android ");
		}
		else
		{
			System.out.println("you can't buy");
		}
		
	}

}
