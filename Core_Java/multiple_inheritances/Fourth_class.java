package com.java.multiple_inheritances;

public class Fourth_class implements Third  {

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		System.out.println("method 5");
		
	}

	@Override
	public void m6() {
		// TODO Auto-generated method stub
		System.out.println("method 6");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("method 3");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("method 4");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("method 1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("method 2");
	}
	public void m7() {
		System.out.println("method 7");
	}
	public static void main(String[] args) {
		Fourth_class fc=new Fourth_class();
		fc.m1();
		fc.m2();
		fc.m3();
		fc.m4();
		fc.m5();
		fc.m6();
		fc.m7();
		
	}
	

}
