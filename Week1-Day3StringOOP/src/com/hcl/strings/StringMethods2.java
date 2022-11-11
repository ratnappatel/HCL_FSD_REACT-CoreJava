package com.hcl.strings;

import java.util.Scanner;

public class StringMethods2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your email id");
		String email=sc.next();
		
		if(email.contains("@") && email.contains("."))
			System.out.println(email+ " : is Valid");
		else
			System.out.println(email+ " : is Not Valid");
		
	}

}
