package com.hcl.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrimitiveArray {
	int arr[]; // declaration 
	Scanner sc;
	public PrimitiveArray() {
		// allocation of memory == all elements will be assigned 0 as defualt
		arr=new int[5];  
		sc=new Scanner(System.in);
	}
	public void print()
	{
		//Native for Loop
		for(int i=0;i<arr.length;i++)
			System.out.print("arr ["+i+"] = "+arr[i]+"\n");		
	}
	public void input()
	{
		System.out.println("Enter Array values");
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();
	}
	public void ascending()
	{
		Arrays.sort(arr);
		this.print();
	}

	public void descending()
	{
		// need to descend actual array[in place descending order]
		
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<5;j++)
			{
				if(arr[i]<arr[j])
				{
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];					
				}
			}
		}
		this.print();
	}
	public static void main(String[] args) {
		PrimitiveArray pa=new PrimitiveArray();
		pa.input();
		pa.print();
		System.out.println("Array in Ascending Order.......");
		pa.ascending();
		System.out.println("Array in Descending Order.......");
		pa.descending();
	}

}
