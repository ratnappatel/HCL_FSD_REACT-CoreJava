package com.hcl.classes;

import java.util.Scanner;

public class CalculatorApp {
	
	public int findMax(int a,int b)
	{		
		int max=Math.max(a, b); //Built-in method of java.lang.Math class
		if(a>b)
			max=a;
		else
			max=b;
		return max;
	}

	public static void main(String[] args) {
		CalculatorApp cal=new CalculatorApp();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(); int b=sc.nextInt();
		int result=cal.findMax(a, b);
		System.out.println("Maximum of give nos is : "+result);

	}

}
