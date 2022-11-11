package com.hcl.arrays;

import java.util.Scanner;

public class MultiDimArray {

	public static void main(String[] args) {
	
		int [][]arr=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements..");
		for(int i=0;i<3;i++) //ROW
		{
			for(int j=0;j<3;j++)
				arr[i][j]=sc.nextInt();
		}
		
		// For display
		for(int i=0;i<3;i++) //ROW
		{
			for(int j=0;j<3;j++)
				System.out.print(arr[i][j]+"   ");
			System.out.println("");
		}

	}

}
