package com.java.super_keyword;

	public class This_class {
		int v,d;
		float f;
		String s;
		This_class()
		{
			 this.v = 12;
			  this.d= 23;
			  this.f = 2.4f;
			  this.s = "Hello World";
		}
		This_class(int a,int b, String c)
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
			This_class c = new This_class();
			System.out.println(c.v);
			int a=22;
			int b=34;
			String c2="Bye Bye";
			This_class c1 = new This_class(a,b,c2);
			putdata(c1.v,c1.d,c1.s);
		}
	}


