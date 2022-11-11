package com.hcl.pojos;

import java.util.Date;

public class TestAuthor {

	public static void main(String[] args) {
		//One way for creating Author object
		Author a1=new Author();
		
		a1.setId(101);
		a1.setName("abc");
		a1.setNoOfBooks(20);
		a1.setDob(new Date());
		
		a1.printDetails();
		
		//Second way for creating Author object
		
		Date d1=new Date(); // assign current date 
		Author a2=new Author(102,"pqr",39,d1);
		a2.printDetails();	

	}

}
