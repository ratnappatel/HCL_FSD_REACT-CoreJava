package com.hcl.arrays;

import java.util.Scanner;

public class EmployeeManager {
	
	public static Scanner sc;
	int i=0;
	static boolean flag=true;
	Employee emps[];
	
	public EmployeeManager() {
		sc=new Scanner(System.in);
		emps=new Employee[5];
	}
	
	public void addEmployee()
	{
		Employee e=new Employee();// taking input
		if(i<5)
			emps[i]=e;
		else
		{
			flag=false;
			System.out.println("Employee Array is Filled Completely\n You cannot add more employee now.");
			System.exit(1);
		}
		i++;
	}
	public void updateEmployee()
	{
		System.out.println("Enter Name of Employee to be updated");
		String name=sc.next();
		for(int j=0;j<5;j++)
		{
			if(emps[j].name.equals(name))
			{
				System.out.println("Enter Employee ID :");
				int newId=sc.nextInt();
				
				System.out.println("Enter Employee Name :");
				String newName=sc.next();
				
				System.out.println("Enter Employee Designation :");
				String newDesig=sc.next();
				
				System.out.println("Enter Employee DepatmentNo :");
				int newDept=sc.nextInt();
				emps[j].name=newName;
				emps[j].id=newId;
				emps[j].desig=newDesig;
				emps[j].dept=newDept;
				
				System.out.println("Employee Details Updated Successfully..");
				break;
			}
			else
				continue;
		}
		
	}
	public void display()
	{
		System.out.println("=================================================================");
		for(Employee e:emps)
			e.print();
	}
	public void searchEmployee()
	{
		System.out.println("Enter Name of Employee to search");
		String name=sc.next();
		for(int j=0;j<5;j++)
		{
			if(emps[j].name.equals(name))
			{
				emps[j].print();
				break;
			}
			else
				continue;
		}
		//System.out.println("Employee with given name does not exists...");
	}
	public void deleteEmployee()
	{
		System.out.println("Enter Name of Employee to delete");
		String name=sc.next();
		for(int j=0;j<5;j++)
		{
			if(emps[j].name.equals(name))
			{
				emps[j]=new Employee();
				break;
			}
			else
				continue;
		}
	}

	public static void main(String[] args) {
		EmployeeManager em=new EmployeeManager();
		
		int rep=0; //Until user enters 0-zero continue displaying menu
		do {
				System.out.println("1. Add New Employee");
				System.out.println("2. Update Employee Details");
				System.out.println("3. Search An Employee");
				System.out.println("4. Delete An Employee Details");
				System.out.println("5. Display All Employee Details");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					if(!EmployeeManager.flag)
							em.addEmployee();
					else						
						break;
				case 2:
						em.updateEmployee();
						//em.display();
						break;
				case 3:
						em.searchEmployee();
						//em.display();
						break;
				case 4:
						em.deleteEmployee();
						//em.display();
						break;
				case 5:
						em.display();
						break;
				default:
						System.out.println("Invalid Choice");
						break;
						
				}
				System.out.println("Would you like to perform more operation?(0-No/1-YES)");
				rep=sc.nextInt();
		}while(rep>0);
	}
	

}
