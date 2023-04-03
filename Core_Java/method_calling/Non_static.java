package com.java.method_calling;

import com.java.non_static_pck.Non_static_pck;

public class Non_static {
	public void m1() {
		System.out.println("I am non-static m1 call from same class");
	}
	public void m2() {
		System.out.println("I am non-static m2 call from same class");
	}

	public void m3() {
		System.out.println("I am non-static m3 call from same class");
	}
	public static void main(String[] args) {
		Non_static ns=new Non_static();
		Non_static_diff nsd=new Non_static_diff();
		Non_static_pck obj=new Non_static_pck();
		ns.m1();
		ns.m2();
		ns.m3();
		nsd.m4();
		nsd.m5();
		nsd.m6();
		obj.m7();
		obj.m8();
		obj.m9();
	}


}
