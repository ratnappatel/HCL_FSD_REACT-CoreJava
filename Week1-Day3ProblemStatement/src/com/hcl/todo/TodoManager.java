package com.hcl.todo;

import java.util.Scanner;

public class TodoManager {
	static Scanner sc=new Scanner(System.in);
	Task [] tasks=new Task[3];
	int i=0;
	public TodoManager() {
		
	}
	public void addTask()
	{	
		if(i<3)
		{
			Task t1=new Task();
			tasks[i]=t1;
		}
		else
			System.out.println("No more Task can be added..");
		i++;
	}
	public void display()
	{
		
		for(Task t:tasks)
			t.print();
	}

	public static void main(String[] args) {
				TodoManager td=new TodoManager();
				String choice="yes";
				do 
				{
					td.addTask();
					System.out.println("Would you like to continue?(yes/no)");
					choice=sc.next();
					
				}while(choice.equalsIgnoreCase("yes"));
				td.display();
	}
	
}
