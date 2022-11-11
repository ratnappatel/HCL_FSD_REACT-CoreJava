package com.hcl.todo;

import java.util.Scanner;

// POJO = properties + methods
public class Task 
{
	//declare property/attributes/fields/instance-var of class here
	private int taskId;
	private String taskTitle;
	private String taskText;
	private String assignedTo;
	Scanner sc;
	
	// constructor never -have return_type & must have Same name as class-name
	public Task() {
		sc=new Scanner(System.in);
		System.out.println("Inside a Task-class no-argument constructor");
		taskId=(int)(Math.random()*100);
		System.out.println("TaskId : "+taskId);
		
		System.out.println("Enter Task Title");
		taskTitle=sc.next();
		System.out.println("Enter AssigneTo User Name");
		assignedTo=sc.next();
		System.out.println("Enter Task Text");
		taskText=sc.next();
	}
	public void print()
	{
		System.out.println("========================================");
		// Task t=new Task(); t.taskId==this.taskId
		System.out.println("Taks ID : "+this.taskId);
		System.out.println("Task Title : "+this.taskTitle);
		System.out.println("Task Text : "+this.taskText);
		System.out.println("Task Assigned To : "+this.assignedTo);
	}
	
}

//create a Task to buyGrocery as items Semolina, WheatFlour, Cow's Ghee,'==> Gargesh