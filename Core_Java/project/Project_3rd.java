package com.java.project;

import java.util.Scanner;

public class Project_3rd {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<=10;i++) {
	System.out.println("choose your Root");
    System.out.println("1.pune to mumbai");
    System.out.println("2.pune to nashik");
    int  root=sc.nextInt();
    System.out.println("you choose the: " +root);
    System.out.println("Enter your money");
	int money=sc.nextInt();
    if(root==1) {
    	System.out.println("you choose the pune to mumbai root");
    	if(money>=1500) {
    		System.out.println("you can booked ticket for any of these travels or you can go through your own private travels");
    	}
    	else if (money>=1000) {
    		System.out.println("you can booked ticket for ShivShahi");
    	}
    	else if(money>=800) {
    		System.out.println("you can booked ticket for shivnery");
    	}
    	else if(money>=400) {
    		System.out.println("you can booked tiket for MSRTC");
    	}
    	else
    	{
    		System.out.println("you can booked tiket for Private travels");
    	}
    }
    
    else
    {
    	System.out.println("you choose the pune to nashik root");
    	
    	if(money>=1500) {
    		System.out.println("you can booked ticket for any of these travels or you can go through your own private travels");
    	}
    	else if(money>=1000) {
    		System.out.println("you can booked ticket for ShivShahi");
    	}
    	else if(money>=800)
    	{
    		System.out.println("you can booked tiket for shivnery");
    	}
    	else if(money>=400) {
    		System.out.println("you can booked tiket for MSRTC");
    	}
    	else {
    		System.out.println("you can booked tiket for private travels");
    	}
    }
   }
	
	
	
		
	}

}
