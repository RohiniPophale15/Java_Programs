package com.java.method_overriding;

public class Test_overriding {
	public static void main(String[] args) {
		Child_overriding co=new Child_overriding();
		co.bike();
		co.car();
		co.farm();
		co.house();
		Parent_overriding po=new Parent_overriding();
		po.bike();
		po.car();
		po.farm();
		po.house();
	}

}
