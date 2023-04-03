package com.java.encapsulation;

public class Acc_Test {
	public static void main(String[] args) {
		Account a=new Account();
		a.setAcc_no(123456778);
		a.setName("Rohini");
		a.setAmount(12345.13f);
		a.setEmail("rohinipop03gamil.com");
		System.out.println(a.getAcc_no());
	    System.out.println(a.getAmount());
	    System.out.println(a.getEmail());
	    System.out.println(a.getName());
	}
	

}
