package com.java.interface_task;

public class Oppo implements Features {

	@Override
	public void ram() {
		// TODO Auto-generated method stub
		System.out.println("oppo ram : 8GB");
		
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("oppo camera : 12 mega pixel");
		
	}

	@Override
	public void battery() {
		// TODO Auto-generated method stub
		System.out.println("oppo battery : 3.85 V");
		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("oppo price : 15000 rs");
		
	}
	public static void main(String[] args) {
		Oppo o=new Oppo();
		o.ram();
		o.camera();
		o.battery();
		o.price();
		Samsung s=new Samsung();
		s.battery();
		s.camera();
		s.ram();
		s.price();
		Realme r=new Realme();
		r.ram();
		r.battery();
		r.camera();
		r.price();
		One_plus op=new One_plus();
		op.ram();
		op.camera();
		op.battery();
		op.price();
	}

}
