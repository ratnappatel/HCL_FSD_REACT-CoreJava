package com.hcl.flow;

import java.util.Scanner;

public class IterativeFlow {

	public void countAmount(int currency,int n)
	{
		int amount=0;
		for(int i=1;i<=n;i++)
			amount=amount+currency;
		System.out.println("Amount you submited to machine is : "+amount);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Currency type");
		int currency=sc.nextInt();

		System.out.println("Enter No.of Notes");
		int notes=sc.nextInt();
		IterativeFlow flow=new IterativeFlow();
		flow.countAmount(currency, notes);		
		
	}

}
