package com.hcl.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ObjectArray {

	String arr[];
	Scanner sc;
	public ObjectArray() {
		arr=new String[5];
		sc=new Scanner(System.in);
	}
	public void input()
	{
		System.out.println("Enter Companies Name");
		for(int i=0;i<5;i++)
			arr[i]=sc.next();
	}
	public void ascending()
	{
		// in-place sorting of elements
		Arrays.sort(arr);
	}
	public void print()
	{
		//Enhanced For--Loop ==> can be used with array/list/set/map 
		for(String element:arr)
			System.out.println(element);
	}
	
	public void descending()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<5;j++)
			{
				if(arr[i].compareTo(arr[j])<0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}					
			}
		}		
	}
	public static void main(String[] args) {
		ObjectArray oa=new ObjectArray();
		oa.input();
		oa.print(); //Actual Array 
		System.out.println("==========================\nSorted Array Elements are");
		oa.ascending();
		oa.print(); //After array modified to ascending sequence
		System.out.println("==========================\nDescending Elements are");
		oa.descending();
		oa.print();

	}

}
