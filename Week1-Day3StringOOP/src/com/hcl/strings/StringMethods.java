package com.hcl.strings;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Name");
			
			// next method terminates reading an input when encounters blank_space
			String name=sc.next(); 
			boolean flag=false;
			for(int i=0;i<name.length();i++)
			{
				char c=name.charAt(i);
				if(c>=65 && c<=91 || c>=97 && c<=122)
					continue;
				else
				{
					flag=true;
					break;
				}
			}
			if(flag)
				System.out.println("Your input is not valid");
			else
				System.out.println("Name consists of "+name.length()+"  Characters...");
			
			
	}

}
