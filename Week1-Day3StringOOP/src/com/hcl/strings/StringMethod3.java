package com.hcl.strings;

import java.util.Scanner;

public class StringMethod3 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence to reverse...");
		String input=sc.nextLine(); // permit blank_space
		
		char arr[]=input.toCharArray();
		String reverse="";
		for(int i=arr.length-1;i>=0;i--)
				reverse+=arr[i];
		System.out.println("String in Reverse is : \n"+reverse);
		
		reverse="";
		for(int i=input.length()-1;i>=0;i--)
			reverse+=input.charAt(i);
		System.out.println("String in Reverse is : \n"+reverse);
		
		System.out.println("Enter Two");
		

	}

}
