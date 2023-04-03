package com.java.encapsulation;

public class Account {
	private long acc_no;
	private String name , email;
	private float amount;
	public void setAcc_no(long ac_no) {
	acc_no=ac_no;	
	}
	public long getAcc_no() {
		return acc_no;
	}
	public void setName(String Name) {
		name=Name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String Email) {
		email=Email;
	}
	public String getEmail() {
		return email;
	}
	public void setAmount(float Amount) {
		amount=Amount;
	}
	public float getAmount() {
		return amount;
	}
	

}
