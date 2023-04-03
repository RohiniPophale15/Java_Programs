package com.java.conditional_statement;

public class If_else_if_3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int blood_Group=4;
		//Assume A+ blood group is 1
		if(blood_Group==1)
		{
			System.out.println("you can donated A+");
		}
		//Assume A- blood group is 2
		else if(blood_Group==2)
		{
			System.out.println("you can donated A-");
		}
		//Assume B+ blood group is 3
		else if(blood_Group==3)
		{
			System.out.println("you can donated B+");
		}
		//Assume B+ blood group is 4
		else if(blood_Group==4)
		{
			System.out.println("you can donated B-");
		}
		//Assume O+ blood group is 5
		else if(blood_Group==5)
		{
			System.out.println("you can donated O+");
		}
		//Assume O+ blood group is 6
		else if(blood_Group==6)
		{
			System.out.println("you can donated O-");
		}
		else
		{
			System.out.println("you can't donated");
		}

	}

}
