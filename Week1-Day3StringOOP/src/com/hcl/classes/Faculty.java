package com.hcl.classes;

import java.util.Scanner;

public class Faculty
{	
	int id; // instace-variable
	String name;
	String subject;
	long mobile;
	Scanner sc;
	
	public Faculty()
	{
		//this constructor is called default-constructor.
		// it will initialize all fields with default of according to their data-types
		sc=new Scanner(System.in);
	}	
	public Faculty(int id,String name, String subject, long mobile)
	{
		// this == a keyword == an object of current class
		this.id=id;
		this.name=name;
		this.subject=subject;
		this.mobile=mobile;
	}
	public void takeSession()
	{
		System.out.println("Skashi is going to teach Micro-Biology....");
	}
	public void applyLeave()
	{
		System.out.println("Sakshi Says : Grant me a leave on 15-Nov-2022 as CL");
	}
	public void addFacultyDetails()
	{
		System.out.println("Enter Faculty ID: ");
		id=sc.nextInt();
		System.out.println("Enter Faculty Name: ");
		name=sc.next();
		System.out.println("Enter Subject title: ");
		subject=sc.next();
		System.out.println("Enter Mobile no: ");
		mobile=sc.nextLong();
		
	}
	public void printDetails()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Subject : "+subject);
		System.out.println("Mobile-No : "+mobile);
	}
	public static void main(String[] args) {
		Faculty f1=new Faculty();
		f1.addFacultyDetails();
		f1.takeSession();
		f1.applyLeave();
		f1.printDetails();
	}
}
