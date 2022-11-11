package com.hcl.classes;

import java.util.Scanner;

public class Score {
	
	String choice="yes";
	int scores[]=new int[10];
	public int[] addScore()
	{
		int i=0;
		Scanner sc=new Scanner(System.in);
		do {
			if(i<10)
			{
				System.out.println("Enter The Score");
				scores[i]=sc.nextInt();
				i++;
			}
			else
			{
				System.out.println("All Scores are added...");
				break;
			}
			System.out.println("Would you like to add More Scores(yes/no)?");
			choice=sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		return scores;
	}

}
