package com.java.conditional_statement;

public class Nested_if_1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Uname="Rohini@123";
		String pwd="Rohini9284";
		if(Uname=="Rohini@123") {
			System.out.println("your username is correct");
			if(pwd=="Rohini9284") {
				System.out.println("Login sucessful");
			}
			else
			{
				System.out.println("your password is incorrect");
			}
		}
		else
		{
			System.out.println("your username incorrect");
		}

	}

}
