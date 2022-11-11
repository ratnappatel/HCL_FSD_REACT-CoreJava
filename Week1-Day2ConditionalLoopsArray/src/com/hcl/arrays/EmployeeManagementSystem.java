package com.hcl.arrays;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		//int == Employee[Custom-datatype/custom-object] 
		Employee emps[]=new Employee[5]; // allocation memory to whole array = 5element
		for(int i=0;i<5;i++)
		{
			Employee e1=new Employee(); // allocation memory to each element as Employee Object
			emps[i]=e1;
		}
		
		System.out.println("======== All Employee's Detail ============");
		for(Employee e:emps)
		{
			e.print();
			System.out.println("----------------------------------------------------\n");
		}

	}

}
