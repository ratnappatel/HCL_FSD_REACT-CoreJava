package com.hcl.flow;

public class LinearFlow {
	
	public void print1()
	{
		System.out.println("Print 1 Called..");
	}
	public void print2()
	{
		System.out.println("Print 2 Called..");
	}
	
	public void print3()
	{
		System.out.println("Print 3 Called..");
	}

	public static void main(String[] args) {
		
		// Actual Flow of Code is defined in Main method
		LinearFlow flow=new LinearFlow();
		flow.print3();
		flow.print1();
		flow.print2();
	}

}
