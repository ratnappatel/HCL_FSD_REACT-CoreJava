package com.hcl.specifiers;

public class Data {
	
	private int a=10;
	protected int b=20;
			  int c=30;
	public int d=40;
	
	private void method1()
	{
		System.out.println("I am Private by nature..");
	}
	protected void method2()
	{
		System.out.println("I am Protected by nature..");
	}
	 void method3()
	{
		System.out.println("I am Packaged by nature..");
	}
	public void method4()
	{
		System.out.println("I am public by nature..");
	}
	
	public static void main(String[] args) {
		Data d1=new Data();
		System.out.println("Private a = "+d1.a);
		System.out.println("Protected b = "+d1.b);
		System.out.println("Packaged c = "+d1.c);
		System.out.println("Public d = "+d1.d);
		
		d1.method1();
		d1.method2();
		d1.method3();
		d1.method4();

	}

}
