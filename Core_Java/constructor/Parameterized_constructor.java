package com.java.constructor;


	

	public class Parameterized_constructor  {
		int v,d;
		float f;
		String s;
		Parameterized_constructor()
		{
			 this.v = 12;
			  this.d= 23;
			  this.f = 2.4f;
			  this.s = "Hello World";
		}
		Parameterized_constructor(int a,int b, String c)
		{
			this.v = a;
			this.d = b;
			this.s = c;
		}
		static void putdata(int c,int d, String e)
		{
			System.out.println(c+"\n"+d+"\n"+e);
		}
		public static void main(String[] args) {
			Parameterized_constructor c = new Parameterized_constructor();
			System.out.println(c.v);
			int a=22;
			int b=34;
			String c2="Bye Bye";
			Parameterized_constructor c1 = new Parameterized_constructor(a,b,c2);
			putdata(c1.v,c1.d,c1.s);
		}
	}

