package com.java.conditional_statement;

public class If_else_if {

	private static final char[] Oppo = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int budget=25000;
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
			System.out.println(Oppo);
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
