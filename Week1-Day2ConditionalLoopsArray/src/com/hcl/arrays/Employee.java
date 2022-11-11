package com.hcl.arrays;

import java.util.Scanner;

// POJO = Plain Old Java Objects used to manage Data+Data-Operation
public class Employee 
{
	int id;
	 String name;
	 String desig;
	 int dept;
	Scanner sc;
	
	
	public Employee() {
		sc=new Scanner(System.in);
		System.out.println("Enter Employee ID :");
		id=sc.nextInt();
		
		System.out.println("Enter Employee Name :");
		name=sc.next();
		
		System.out.println("Enter Employee Designation :");
		desig=sc.next();
		
		System.out.println("Enter Employee DepatmentNo :");
		dept=sc.nextInt();
	}
	public void print()
	{
		System.out.println("Employee's ID : "+id);
		System.out.println("Employee's Name : "+name);
		System.out.println("Employee's Desig :"+desig);
		System.out.println("Employee's Dept :"+dept);
	}
}
