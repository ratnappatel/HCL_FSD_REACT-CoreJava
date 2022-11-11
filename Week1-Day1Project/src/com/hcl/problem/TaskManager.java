package com.hcl.problem;

import java.util.Scanner;

public class TaskManager {

	public void addTasks(String tasks[])
	{
		// First Check duplicate tasks
		
	}
	public void checkDuplictae()
	{
		
	}
	public void printAscending(String tasks[])
	{
		for(int i=0;i<tasks.length;i++)
		{
			if(tasks[i].compareTo(tasks[i+1])>0)
			{
				String temp=tasks[i];
				tasks[i]=tasks[i+1];
				tasks[i+1]=tasks[i];
			}
			
		}
		
	}
	public void printDescending()
	{
		
	}
	public static void main(String[] args) {
		TaskManager t1=new TaskManager();
		String tasks[]=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 tasks");
		for(int i=0;i<5;i++)
			sc.next();
		//String tasks[]= {"G","E","O","Q","A"};
		t1.addTasks(tasks);
		

	}

}
