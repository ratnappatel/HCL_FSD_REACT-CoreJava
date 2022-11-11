package com.hcl.polymorphsm;

public class Calculator {

	
	public void add(int a, float b)
	{
		float total=a+b;
		System.out.println("Total = "+total);
	}
	public void add(float a, int b)
	{
		float total=a+b;
		System.out.println("Total = "+total);
	}
	public void add(int a, double b)
	{
		double total=a+b;
		System.out.println("Total = "+total);
	}
	
	public void add(int a,int b)
	{
		int total=a+b;
		System.out.println("Total = "+total);
	}
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		
		//Static Polymorphism
		calc.add(234.345f, 243);
		calc.add(23, 45.456f);
		calc.add(234, 2354.456);
		calc.add(241,84);

	}

}
