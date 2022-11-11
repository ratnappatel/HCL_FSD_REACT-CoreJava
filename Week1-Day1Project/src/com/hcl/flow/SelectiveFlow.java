package com.hcl.flow;

import java.util.Scanner;

public class SelectiveFlow {
	
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
		SelectiveFlow flow=new SelectiveFlow();
		
		// Dynamically - we will prompt choice of end-user 
		System.out.println("Select sequence in which you would like to run 3-methods"
				+ "\n..[enter method number[1/2/3] seperated by comma]"); //Alpha-Numeric string
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		String arr[]=input.split(",");
		
		for(int i=0;i<arr.length;i++)
		{
			switch(arr[i])
			{
				case "1":
					flow.print1();
					break;
				case "2":
					flow.print2();
					break;
				case "3":
					flow.print3();
					break;
				default:
					System.out.println("Not a Valid Choice.");
			}
		}	
	}

}
